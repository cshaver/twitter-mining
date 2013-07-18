import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

/*
 * Copyright 2013 Sabre Holdings
 */

/**
 * Infer flight information from tweets and store in database.
 * 
 * @author Qing Ke (Qing.Ke@sabre.com)
 * 
 */
public class FlightMatcher {

	private KeywordsDatabase corpus = null;

	public FlightMatcher(String airportFilePath, String twitterAirlineFilePath,
			String airlineCodeFilePath) throws IOException {
		corpus = new KeywordsDatabase(airportFilePath, twitterAirlineFilePath,
				airlineCodeFilePath);
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
	 * @throws JSONException
	 */
	public void match(String status) throws JSONException {
		JSONObject tweet = new JSONObject(status);
		if (!tweet.getString("lang").equals("en")) // only English tweets
			return;

		int cnt = 0;
		String airline = getAirline(tweet);
		if (airline != null) {
			cnt++;
		}
		String flightNumber = getFlightNumber(tweet);
		if (flightNumber != null) {
			cnt++;
		}
		List<String> airports = getAirport(tweet);
		if (airports.size() > 0) {
			cnt++;
		}
		List<String> city = getCity(tweet);
		if (city.size() > 0) {
			cnt++;
		}
		if (cnt > 1) {
			System.out.println(tweet.getString("text"));
		}
	}

	public String getAirline(JSONObject tweet) throws JSONException {
		JSONArray userMentions = tweet.getJSONObject("entities").getJSONArray(
				"user_mentions");

		if (userMentions.length() > 0) { // inferring from user mentions
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
		} else { // inferring from tweet content
			String content = tweet.getString("text");
			String[] words = content.split("\\s+");
			for (int i = 0; i < words.length - 1; ++i) { // bigram
				String bigram = Utils.stripFully(words[i]) + " "
						+ Utils.stripFully(words[i + 1]);
				if (corpus.isAirlineName(Utils.strip(bigram))) {
					// System.out.println(bigram + " -> " + content);
					return bigram;
				}
			}
			for (int i = 0; i < words.length - 2; ++i) { // 3-gram
				String gram = Utils.stripFully(words[i]) + " "
						+ Utils.stripFully(words[i + 1]) + " "
						+ Utils.stripFully(words[i + 2]);
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
		}
		return null;
	}

	public String getFlightNumber(JSONObject tweet) throws JSONException {
		String content = tweet.getString("text");
		String[] words = content.split("\\s+");
		for (int i = 0; i < words.length - 1; ++i) { // flight XXXX
			if (Utils.strip(words[i]).toLowerCase().equals("flight")) {
				if (Utils.isInt(Utils.stripPunct(words[i + 1]))) {
					String flightNumber = Utils.stripPunct(words[i + 1]);
					// System.out.println(flightNumber + " -> " + content);
					return flightNumber;
				}
			}
		}
		return null;
	}

	public List<String> getAirport(JSONObject tweet) throws JSONException {
		List<String> airports = new ArrayList<String>();
		JSONArray hashtags = tweet.getJSONObject("entities").getJSONArray(
				"hashtags");
		String content = tweet.getString("text");

		if (hashtags.length() > 0) { // inferring from hashtags
			for (int i = 0; i < hashtags.length(); ++i) {
				JSONObject tag = hashtags.getJSONObject(i);
				String text = tag.getString("text").toUpperCase();
				if (corpus.isAirportCode(text)) {
					// System.out.println("#" + text + " -> " + content);
					airports.add(text);
				}
			}
		} else {
			String[] words = content.split("\\s+");
			for (int i = 0; i < words.length - 1; ++i) { // bigram
				String bigram = Utils.stripFully(words[i]) + " "
						+ Utils.stripFully(words[i + 1]);
				if (corpus.isAirportName(Utils.strip(bigram))) {
					// System.out.println(bigram + " -> " + content);
					airports.add(bigram);
				}
			}
			for (int i = 0; i < words.length - 2; ++i) { // 3-gram
				String gram = Utils.stripFully(words[i]) + " "
						+ Utils.stripFully(words[i + 1]) + " "
						+ Utils.stripFully(words[i + 2]);
				if (corpus.isAirportName(Utils.strip(gram))) {
					// System.out.println(gram + " -> " + content);
					airports.add(gram);
				}
			}
			for (String word : words) {
				if (corpus.isAirportName(Utils.strip(word))) {
					// System.out.println(word + " -> " + content);
					airports.add(word);
				}
			}
		}
		if (airports.size() > 0) {
			// System.out.println(airports + " -> " + content);
		}
		return airports;
	}

	public List<String> getCity(JSONObject tweet) throws JSONException {
		List<String> cities = new ArrayList<String>();
		String content = tweet.getString("text");
		String[] words = content.split("\\s+");
		for (int i = 0; i < words.length - 1; ++i) { // bigram
			String bigram = Utils.stripFully(words[i]) + " "
					+ Utils.stripFully(words[i + 1]);
			if (corpus.isCityName(Utils.strip(bigram))) {
				// System.out.println(bigram + " -> " + content);
				cities.add(bigram);
			}
		}
		for (int i = 0; i < words.length - 2; ++i) { // 3-gram
			String gram = Utils.stripFully(words[i]) + " "
					+ Utils.stripFully(words[i + 1]) + " "
					+ Utils.stripFully(words[i + 2]);
			if (corpus.isCityName(Utils.strip(gram))) {
				// System.out.println(gram + " -> " + content);
				cities.add(gram);
			}
		}
		for (String word : words) {
			if (corpus.isCityName(Utils.strip(word))) {
				// System.out.println(word + " -> " + content);
				cities.add(word);
			}
		}
		if (cities.size()>0) {
			// System.out.println(cities + " -> " + content);
		}
		return cities;
	}

	public static void main(String[] args) throws IOException {
		String airportFilePath = Constants.KEYWORDS_AIRPORT_DATA_PATH;
		String twitterAirlineFilePath = Constants.KEYWORDS_AIRLINE_TWITTER_DATA_PATH;
		String airlineCodeFilePath = Constants.KEYWORDS_AIRLINE_CODE_DATA_PATH;

		String path = "data" + File.separator
				+ "raw-tweets-20130715-175823.txt";
		FileInputStream fis = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		FlightMatcher matcher = new FlightMatcher(airportFilePath,
				twitterAirlineFilePath, airlineCodeFilePath);
		while (br.ready()) {
			line = br.readLine();
			try {
				matcher.match(line);
			} catch (JSONException e) {
				System.out.println("Can not parse: " + line);
			}
		}
		br.close();
	}
}
