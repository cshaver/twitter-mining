/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.simple.parser.ParseException;

import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

/**
 * Infer flight information from tweets and store in database.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class FlightMatcher {

	private KeywordsDatabase corpus = null;
	private StoreToDB db = new StoreToDB();
	private SentimentAnalyzer sa = new SentimentAnalyzer();

	public FlightMatcher(String airportFilePath, String twitterAirlineFilePath,
			String airlineCodeFilePath, String generalKeywordsFilePath)
			throws IOException {
		
		corpus = new KeywordsDatabase(airportFilePath, twitterAirlineFilePath,
				airlineCodeFilePath, generalKeywordsFilePath);
		
	}

	/**
	 * Below is a list of attempts to infer flight information, from high to low
	 * priority:
	 * 
	 * 1. Getting (airline, flight number) -> other information. Airline from
	 * text or user mention (@xxxx)
	 * 
	 * 2. Getting airport -> city.
	 * 
	 * 3. Getting city.
	 * 
	 * @param tweet
	 * @throws Exception 
	 * @throws SQLException 
	 * @throws ParseException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NumberFormatException 
	 */
	public void match(String status) throws NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, ParseException, SQLException, Exception {
		JSONObject tweet = new JSONObject(status);
		if (!tweet.getString("lang").equals("en")) // only English tweets
			return;

		String sentiment_type = null;
		String airline = getAirline(tweet);
		String flightNumber = getFlightNumber(tweet);
		Set<String> airports = getAirport(tweet);
		Set<String> cities = getCity(tweet);

		PlaceInfo geoLoc = new PlaceInfo();
		if (!tweet.isNull("place")) {
			geoLoc = getPlaceInfo(tweet);
			if (airports == null && geoLoc.isAirportAvailable()) {
				airports = new HashSet<String>();
				airports.add(geoLoc.getAirport());
			} else if (airports == null && cities == null) {
				cities = new HashSet<String>();
				cities.add(geoLoc.getCity());
			}
		}
		String userLoc = getLocFromUserProfile(tweet);

		String tweetID = tweet.getString("id_str");
		String created_at = tweet.getString("created_at");
		String content = tweet.getString("text");
		
		String date = newDateFormat(created_at);
		
		JSONObject user = tweet.getJSONObject("user");
			String name = user.getString("screen_name");
			int followers = user.getInt("followers_count");

		sentiment_type = sa.getSentiment(content);

		AirportFinder arpFinder = new AirportFinder();

		System.out.println("Content: " + content.replaceAll("\n", " "));
		System.out.println("profile and geo- location: " + userLoc + "; " + geoLoc);
		System.out.println("airline and flight number: " + airline + "; " + flightNumber);
		System.out.println("airport and city: " + airports + "; " + cities);

		if (airline != null && flightNumber != null) {
			processCondition1(airline, flightNumber, airports, cities, tweetID, content, created_at, arpFinder);
		} else if (airline != null && flightNumber == null) {
			processCondition2(airline, airports, cities, tweetID, content, created_at, arpFinder);
		} else if (airline == null && flightNumber != null) {
			processCondition3(flightNumber, airports, cities, tweetID, content, created_at, arpFinder);
		} else {
			processCondition4(airports, cities, tweetID, content, created_at, arpFinder);
		}
		
		String keywords = keywordPresent(content);
		db.writeTwitterData(content, date, userLoc, name, sentiment_type, keywords, followers);

		System.out.println();
	}

	/*
	 * process the condition that both airline and flight number are available
	 */
	private void processCondition1(String airline, String flightNumber, Set<String> airports,
			Set<String> cities, String tweetID, String content, String created_at, AirportFinder arpFinder) throws IOException, JSONException, NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, ParseException, Exception, SQLException {
		AirlineMatcher matcher = null;
		if (Utils.isInt(flightNumber)) {
			// flight number is integer, assuming it is valid
			String code = corpus.getAirlineCodeFromName(airline);
			String full = code + flightNumber;
			matcher = new AirlineMatcher(tweetID, code, full, "", "", created_at);
			matcher.determineLikelyFlight();
		} else { // flight number is not an integer
			String likelyCode = Utils.stripFully(flightNumber);
			String airlineCode = corpus.getAirlineCodeFromName(airline);
			if (likelyCode.toUpperCase().equals(airlineCode)) { // consistent
				matcher = new AirlineMatcher(tweetID, airlineCode, flightNumber, "", "", created_at);
				matcher.determineLikelyFlight();
			} else { // high chance it is not a valid flight #
				// flight number is not useful
				processCondition2(airline, airports, cities, tweetID, content, created_at, arpFinder);
			}
		}
	}

	/*
	 * Airline is available, flight number is not available.
	 */
	private void processCondition2(String airline, Set<String> airports,
			Set<String> cities, String tweetID, String content, String created_at, 
			AirportFinder arpFinder) throws IOException, JSONException, NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, ParseException, java.text.ParseException, SQLException {
		List<String> listOfAirports = new ArrayList<String>();
		if (airports != null)
			listOfAirports.addAll(airports);
		List<String> listOfCities = new ArrayList<String>();
		if (cities != null)
			listOfCities.addAll(cities);
		String code = corpus.getAirlineCodeFromName(airline);
		AirlineMatcher matcher = null;
		if (airports != null) {
			// airline and airport available
			if (airports.size() == 1) {
				if (cities == null) {
					matcher = new AirlineMatcher(tweetID, code, "", listOfAirports.get(0), "", created_at);
					matcher.determineLikelyFlight();
				} else {
					List<String> likely = new ArrayList<String>();
					for (String city : cities) {
						likely.addAll(arpFinder.find(city));
					}
					for (String arp : likely) {
						matcher = new AirlineMatcher(tweetID, code, "", listOfAirports.get(0), arp, created_at);
						matcher.determineLikelyFlight();
					}
				}
			} else if (airports.size() == 2) {
				matcher = new AirlineMatcher(tweetID, code, "", listOfAirports.get(0), listOfAirports.get(1), created_at);
				matcher.determineLikelyFlight();
			} else {
				System.out.println("unprocessed");
			}
		} else {
			// airline available, flight # unavailable, airport unavailable
			if (cities != null) {
				// airline available, airport unavailable, cities available
				if (cities.size() == 1) {
					System.out.println("cities:" + listOfCities.get(0));
					List<String> likelyAirports = arpFinder.find(listOfCities.get(0));
					if (likelyAirports != null) {
						for (String arp : likelyAirports) {
							matcher = new AirlineMatcher(tweetID, code, "", arp, "", created_at);
							matcher.determineLikelyFlight();
						}
					} else { // no possible airport
						matcher = new AirlineMatcher(tweetID, code, "", "", "", created_at);
						matcher.determineLikelyFlight();
					}
				} else if (cities.size() == 2) { // assuming origin and dst
					List<String> likelyFromAirports = arpFinder.find(listOfCities.get(0));
					List<String> likelyToAirports = arpFinder.find(listOfCities.get(1));
					for (String from : likelyFromAirports) {
						for (String to : likelyToAirports) {
							matcher = new AirlineMatcher(tweetID, code, "", from, to, created_at);
							matcher.determineLikelyFlight();
						}
					}
				} else {
					// almost impossible
				}
			} else {
				// airline available, airport unavailable, cities unavailable
				System.out.println("I'm here:" + code);
				System.out.println(code);
				matcher = new AirlineMatcher(tweetID, code, "", "", "", created_at);
				matcher.determineLikelyFlight();
			}
		}
	}

	/* airline unavailable, flight number available */
	private void processCondition3(String flightNumber, Set<String> airports,
			Set<String> cities, String tweetID, String content, String created_at, AirportFinder arpFinder) throws Exception {
		if (Utils.isInt(flightNumber)) {
			List<String> listOfAirports = new ArrayList<String>();
			if (airports != null)
				listOfAirports.addAll(airports);
			List<String> listOfCities = new ArrayList<String>();
			if (cities != null)
				listOfCities.addAll(cities);
			AirlineMatcher matcher = null;
			if (airports != null) {
				// airline unavailable, airport available
				if (airports.size() == 1) {
					matcher = new AirlineMatcher(tweetID, "", flightNumber, listOfAirports.get(0), "", created_at);
					matcher.determineLikelyFlight();
				} else if (airports.size() == 2) {
					matcher = new AirlineMatcher(tweetID, "", flightNumber, listOfAirports.get(0), listOfAirports.get(1),created_at);
					matcher.determineLikelyFlight();
				} else {
					System.out.println("unprocess");
				}
			} else {
				// airline unavailable, airport unavailable
				if (cities != null) {
					// airline unavailable, airport unavailable, cities available
					if (cities.size() == 1) {
						List<String> likelyAirports = arpFinder.find(listOfCities.get(0));
						if (likelyAirports != null) { // some possible airports
							for (String arp : likelyAirports) {
								matcher = new AirlineMatcher(tweetID, "", flightNumber, arp, "", created_at);
								matcher.determineLikelyFlight();
							}
						} else { // no possible airport
							matcher = new AirlineMatcher(tweetID, "", flightNumber, "", "", created_at);
						}
					} else if (cities.size() == 2) { // assuming origin and dst
						List<String> likelyFromAirports = arpFinder.find(listOfCities.get(0));
						List<String> likelyToAirports = arpFinder.find(listOfCities.get(1));
						for (String from : likelyFromAirports) {
							for (String to : likelyToAirports) {
								matcher = new AirlineMatcher(tweetID, "", "", from, to, created_at);
								matcher.determineLikelyFlight();
							}
						}
					} else { // more than 3 cities...
						// almost impossible
					}
				} else {
					// airline unavailable, airport unavailable, cities unavailable
					matcher = new AirlineMatcher(tweetID, "", flightNumber, "", "", created_at);
					matcher.determineLikelyFlight();
				}
			}
		} else { // not digits
			String number = Utils.stripLetters(flightNumber);
			String likelyCode = Utils.stripFully(flightNumber).toUpperCase();
			if (corpus.isAirlineCode(likelyCode)) {
				processCondition1(likelyCode, number, airports, cities, tweetID, content, created_at, arpFinder);
			} else {
				System.out.println("unprocessed");
			}
		}
	}

	private void processCondition4(Set<String> airports, Set<String> cities, 
			String tweetID, String content, String created_at, AirportFinder arpFinder) throws IOException, JSONException, NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, ParseException, java.text.ParseException, SQLException {
		AirlineMatcher matcher = null;
		List<String> listOfAirports = new ArrayList<String>();
		if (airports != null)
			listOfAirports.addAll(airports);
		List<String> listOfCities = new ArrayList<String>();
		if (cities != null)
			listOfCities.addAll(cities);
		if (airports != null) {
			if (airports.size() == 1) {
				matcher = new AirlineMatcher(tweetID, "", "", listOfAirports.get(0), "", created_at);
				matcher.determineLikelyFlight();
			} else if (airports.size() == 2) {
				matcher = new AirlineMatcher(tweetID, "", "", listOfAirports.get(0), listOfAirports.get(1), created_at);
				matcher.determineLikelyFlight();
			} else {
				System.out.println("unprocess");
			}
		} else {
			if (cities != null) {
				if (cities.size() == 1) {
					List<String> likelyAirports = arpFinder.find(listOfCities.get(0));
					if (likelyAirports != null) { // some possible airports
						for (String arp : likelyAirports) {
							matcher = new AirlineMatcher(tweetID, "", "", arp, "", created_at);
							matcher.determineLikelyFlight();
						}
					} else { // no possible airport
						matcher = new AirlineMatcher(tweetID, "", "", "", "", created_at);
						matcher.determineLikelyFlight();
					}
				} else if (cities.size() == 2) { // assuming origin and dst
					List<String> likelyFromAirports = arpFinder.find(listOfCities.get(0));
					List<String> likelyToAirports = arpFinder.find(listOfCities.get(1));
					for (String from : likelyFromAirports) {
						for (String to : likelyToAirports) {
							matcher = new AirlineMatcher(tweetID, "", "", from, to, created_at);
							matcher.determineLikelyFlight();
						}
					}
				} else { // more than 3 cities...
					// almost impossible
				}
			} else {
				// airline unavailable, airport unavailable, cities unavailable
				matcher = new AirlineMatcher(tweetID, "", "", "", "", created_at);
				matcher.determineLikelyFlight();
			}
		}
	}

	public String getAirline(JSONObject tweet) throws JSONException {
		// 1. inferring from user mentions
		JSONArray userMentions = tweet.getJSONObject("entities").getJSONArray("user_mentions");
		if (userMentions.length() > 0) { // 
			for (int i = 0; i < userMentions.length(); ++i) {
				JSONObject mention = userMentions.getJSONObject(i);
				String screenName = "@" + mention.getString("screen_name");
				if (corpus.isTwitterAccount(screenName)) {
					String airline = corpus
							.getAirlineFromTwitterName(screenName);
					// System.out.println(screenName + " -> " + airline);
					return airline;
				}
			}
		}

		// 2. inferring from hashtags
		JSONArray hashtags = tweet.getJSONObject("entities").getJSONArray("hashtags");
		if (hashtags.length() > 0) { // 
			for (int i = 0; i < hashtags.length(); ++i) {
				JSONObject tag = hashtags.getJSONObject(i);
				String tagText = tag.getString("text");
				if (corpus.isAirlineAlias(tagText)) {
					String airline = corpus.getArilineNameFromAlias(tagText);
					// System.out.println(tagText + " -> " + airline);
					return airline;
				}
			}
		}
		
		// 3. inferring from tweet content
		String content = tweet.getString("text");
		String[] words = content.split("\\s+");
		for (int i = 0; i < words.length - 1; ++i) { // bigram
			String bigram = Utils.stripFully(words[i]) + " " + Utils.stripFully(words[i + 1]);
			if (corpus.isAirlineName(Utils.strip(bigram))) {
				// System.out.println(bigram + " -> " + content);
				return bigram;
			}
		}
		for (int i = 0; i < words.length - 2; ++i) { // 3-gram
			String gram = Utils.stripFully(words[i]) + " " + Utils.stripFully(words[i + 1]) + " " + Utils.stripFully(words[i + 2]);
			if (corpus.isAirlineName(Utils.strip(gram))) {
				// System.out.println(gram + " -> " + content);
				return gram;
			}
		}
		for (String word : words) {
			if (corpus.isAirlineName(Utils.strip(word))) {
				// System.out.println(word + " -> " + content);
				return word;
			}
		}

		// no airline info
		return null;
	}

	public String getFlightNumber(JSONObject tweet) throws JSONException {
		String content = tweet.getString("text");
		String[] words = content.split("\\s+");
		boolean keywordPresent = false;
		for (int i = 0; i < words.length; ++i) { // flight XXXX
			String str = Utils.stripPunct(words[i]);
			if (isKeyWordPresent(str)) {
				keywordPresent = true;
				break;
			}
		}

		if (keywordPresent) {
			for (int i = 0; i < words.length; ++i) {
				String str = Utils.stripPunct(getDigitsFromFlightString(
						keywordPresent, words[i]));
				if (Utils.isInt(str)
						&& (str.length() == 4 || str.length() == 3 || words[i]
								.length() == 4)) {
					str = Utils.stripPunct(words[i]);
					// System.out.println(tweet.getString("text"));
					// System.out.println("flight number: " + str);
					return str;
				}
			}
		}
		return null;
	}
	
	private String keywordPresent(String tweet) {
		
		String keyword = "";
		
		if(tweet.contains("flight") ){
			keyword.concat("flight, ");
		}
		if(tweet.contains("airport") ){
			keyword.concat("airport, ");
		}
		if(tweet.contains("flying") ){
			keyword.concat("flying, ");
		}
		if(tweet.contains("plane") ){
			keyword.concat("plane, ");
		}
		if(tweet.contains("airplane") ){
			keyword.concat("airplane, ");
		}
		if(tweet.contains("airline") ){
			keyword.concat("airline, ");
		}		
		if(tweet.contains("board") ){
			keyword.concat("board, ");
		}
		if(tweet.contains("boarding") ){
			keyword.concat("boarding, ");
		}
		if(tweet.contains("depart") ){
			keyword.concat("depart, ");
		}
		if(tweet.contains("departing") ){
			keyword.concat("departing, ");
		}
		if(tweet.contains("landing") ){
			keyword.concat("landing, ");
		}
		if(tweet.contains("attendant") ){
			keyword.concat("attendant, ");
		}
		if(tweet.contains("delay") ){
			keyword.concat("delay, ");
		}
			
		return keyword;
		
	}

	
	private boolean isKeyWordPresent(String word) {
		return Utils.strip(word).toLowerCase().equals("flight")
				|| Utils.strip(word).toLowerCase().equals("airport")
				|| Utils.strip(word).toLowerCase().equals("flying")
				|| Utils.strip(word).toLowerCase().equals("plane")
				|| Utils.strip(word).toLowerCase().equals("airplane")
				|| Utils.strip(word).toLowerCase().equals("airline")
				|| Utils.strip(word).toLowerCase().equals("board")
				|| Utils.strip(word).toLowerCase().equals("boarding")
				|| Utils.strip(word).toLowerCase().equals("departing")
				|| Utils.strip(word).toLowerCase().equals("landing");
	}

	private String getDigitsFromFlightString(boolean keywordPresent, String str) {
		// 64 = '@'
		if (keywordPresent && str.length() <= 7 && str.charAt(0) != 64) {
			for (int i = 0; i < str.length(); i++) {
				// ASCII values for 0 to 9
				if (str.charAt(i) > 47 && str.charAt(i) < 58) {
					return str.substring(i);
				}
			}
		}
		return str;
	}

	private boolean containsKeyword(String content) {
		String[] words = content.split("\\s+");
		for (String word : words) {
			if (corpus.isGeneralKeyword(Utils.stripFully(word).toLowerCase()))
				return true;
		}
		return false;
	}

	public PlaceInfo getPlaceInfo(JSONObject tweet) throws JSONException {
		PlaceInfo place = new PlaceInfo();
		JSONObject placeInfo = tweet.getJSONObject("place");
		String placeType = placeInfo.getString("place_type");
		if (placeType.equals("poi")) {
			String fullName = placeInfo.getString("full_name");
			if (fullName.toLowerCase().contains("airport")) { // airport
				place.setAirport(fullName.split(", ")[0]);
				place.setCity(fullName.split(", ")[1]);
			} else {
				place.setCity(fullName);
			}
		} else if (placeType.equals("neighborhood") || placeType.equals("city")) {
			String fullName = placeInfo.getString("full_name");
			place.setCity(fullName);
		}
		return place;
	}

	public Set<String> getAirport(JSONObject tweet) throws JSONException {
		String content = tweet.getString("text");
		if (!containsKeyword(content)) {
			return null;
		}
		Set<String> airports = new HashSet<String>();
		List<String> words = processContent(content);

		// Airport code - 1. inferring from hashtags
		JSONArray hashtags = tweet.getJSONObject("entities").getJSONArray(
				"hashtags");
		if (hashtags.length() > 0) {
			for (int i = 0; i < hashtags.length(); ++i) {
				JSONObject tag = hashtags.getJSONObject(i);
				String text = tag.getString("text").toLowerCase()
						.replaceAll("airport", "").toUpperCase();
				if (corpus.isAirportCode(text)) {
					String airportName = corpus.getAirportNameFromCode(text);
					airports.add(airportName);
					// System.out.println("Hashtag: " + text + " -> "
					// + airportName + "; " + content);
				}
			}
		}
		// Airport code - 2. inferring from content
		for (String word : words) {
			if (corpus.isAirportCode(word)) {
				String airportName = corpus.getAirportNameFromCode(word);
				airports.add(airportName);
				// System.out.println("Word: " + word + " -> " + airportName
				// + "; " + content);
			}
		}

		// Airport name - content
		for (int i = 0; i < words.size() - 2; ++i) { // tri-gram
			String trigram = words.get(i) + " " + words.get(i + 1) + " "
					+ words.get(i + 2);
			if (corpus.isAirportName(trigram)) {
				airports.add(trigram);
				// System.out
				// .println("Match tri-bigram: " + trigram + " -> " + content);
			}
		}
		for (int i = 0; i < words.size() - 1; ++i) { // bigram
			String bigram = words.get(i) + " " + words.get(i + 1);
			if (corpus.isAirportName(bigram)) {
				airports.add(bigram);
				// System.out.println("Match bigram: " + bigram + " -> " + content);
			}
		}
		for (String word : words) {
			if (corpus.isAirportName(word)) {
				airports.add(word);
			}
		}
		return airports.size() > 0 ? airports : null;
	}

	/*
	 * 1. Ignoring user mentions (@);
	 * 
	 * 2. Removing '#';
	 * 
	 * 3. Replace 'intl' with 'international'
	 */
	private List<String> processContent(String content) {
		String[] words = content.split("\\s+");
		List<String> results = new ArrayList<String>();
		for (String word : words) {
			if (word.startsWith("@") || word.length() <= 1)
				continue;
			String processed = word.replaceAll("#", "").replaceAll("int('?)l(\\.?)", "international");
			results.add(processed);
		}
		return results;
	}

	public Set<String> getCity(JSONObject tweet) throws JSONException {
		String content = tweet.getString("text");
		if (!containsKeyword(content)) {
			return null;
		}

		Set<String> cities = new HashSet<String>();
		cities.clear();

		// inferring city code from hashtags
		JSONArray hashtags = tweet.getJSONObject("entities").getJSONArray("hashtags");
		if (hashtags.length() > 0) {
			for (int i = 0; i < hashtags.length(); ++i) {
				JSONObject tag = hashtags.getJSONObject(i);
				String text = tag.getString("text").toLowerCase();
				if (text.equals("nyc")) {
					cities.add("New York");
				}
			}
		}

		String[] words = content.split("\\s+");
		boolean bigramAdded = false;
		boolean trigramAdded = false;
		for (int i = 0; i < words.length - 1; ++i) { // bi-gram
			String bigram = Utils.stripFully(words[i]) + " " + Utils.stripFully(words[i + 1]);
			if (corpus.isCityName(Utils.strip(bigram))) {
				// System.out.println(bigram + " -> " + content);
				cities.add(Utils.strip(bigram));
				bigramAdded = true;
			}
		}
		for (int i = 0; i < words.length - 2; ++i) { // 3-gram
			String trigram = Utils.stripFully(words[i]) + " " + Utils.stripFully(words[i + 1]) + " " + Utils.stripFully(words[i + 2]);
			if (corpus.isCityName(Utils.strip(trigram))) {
				// System.out.println(trigram + " -> " + content);
				cities.add(Utils.strip(trigram));
				trigramAdded = true;
			}
		}
		for (String word : words) { // uni-gram
			String city = Utils.stripFully(word);
			if (!bigramAdded && !trigramAdded && corpus.isCityName(city)) {
				// System.out.println(city + " -> " + content);
				cities.add(city);
			}
		}
		if (cities.size() == 0) {
			return null;
		} else {
			for (String city : cities) {
				if (city == null || city.length() == 0) {
					return null;
				}
			}
		}
		return cities;
	}

	public String getLocFromUserProfile(JSONObject tweet) throws JSONException {
		JSONObject user = tweet.getJSONObject("user");
		String loc = user.getString("location");
		return loc.length() > 0 ? loc : null;
	}
	
    private String newDateFormat(String oldDateString) throws java.text.ParseException {
        
        String newDateString;
        String OLD_FORMAT = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
        String NEW_FORMAT = "yyyy-MM-dd   HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
        Date d = sdf.parse(oldDateString);
        sdf.applyPattern(NEW_FORMAT);
        newDateString = sdf.format(d);
        
        return newDateString;
 }


	public static void main(String[] args) throws NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, ParseException, SQLException, Exception {
		String errorTweetFile = "error-tweets.txt";
		FileOutputStream fos = new FileOutputStream(errorTweetFile, true);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter tweetsWriter = new BufferedWriter(osw);

		String airportFilePath = Constants.KEYWORDS_AIRPORT_DATA_PATH;
		String twitterAirlineFilePath = Constants.KEYWORDS_AIRLINE_TWITTER_DATA_PATH;
		String airlineCodeFilePath = Constants.KEYWORDS_AIRLINE_CODE_DATA_PATH;
		String general = Constants.KEYWORDS_GENERAL_DATA_PATH;
		
		String path = "data" + File.separator + "raw-tweets-20130719-013035.txt";
		FileInputStream fis = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		FlightMatcher matcher = new FlightMatcher(airportFilePath,
				twitterAirlineFilePath, airlineCodeFilePath, general);
		while (br.ready()) {
			line = br.readLine();
			try {
				matcher.match(line);
			} catch (Exception e) {
				tweetsWriter.write(line + Constants.EOL);
			}
		}
		br.close();
		tweetsWriter.close();
	}

}
