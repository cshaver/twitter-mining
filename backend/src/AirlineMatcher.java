/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.apache.axis.encoding.Base64;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Submit to FlghtAware.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class AirlineMatcher {
	
		private String tweetID = null;
		private String airline = null;
		private String flightNumber = null;
		private String originAirport = null;
		private String destinationAirport = null;
		private int startTime = 0;	// has to be unix time stamps
		private int endTime = 0;	// tweet post time -- has to be unix time stamps
	
		static ArrayList<String> likely = new ArrayList<String>();
		static ArrayList<String> flights = new ArrayList<String>();
		
		private String authStr = "markmcspadden:67335dec3f3b762a4fb496e9f17c66594ad903a4";
        private String authEncoded = Base64.encode(authStr.getBytes());
        
       private int current = 0;
       private int remaining = 100;
       private int mk = 100;
       
	public AirlineMatcher(String tweetID,String airline, String flightNumber, String originAirport,
			String destinationAirport,String endTime) {

		this.tweetID = tweetID;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.endTime = determineEndTime(endTime);
		startTime = determineStartTime();
	}
	
	/*
	 * 
	 */
	public int determineEndTime(String endTime) {
		
		int time =0;
		
		// will get this format
		// EEE MMM dd HH:mm:ss ZZZZZ yyyy
		
	        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy");
	        Date dt = null;

	        try {
	            dt = formatter.parse(endTime);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(dt);
	        time = (int) ((cal.getTimeInMillis())*.001);

		return time;

	}
	
	/*
	 * 
	 */
	public int determineStartTime() {

		/*
		 * Determine Start time to be 
		 * 6 hours before tweet post
		 */
		
        long ltime = (long) (endTime / .001);
        
        Date date = new Date(ltime);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, -6);

        //startTime = (int) ((cal.getTimeInMillis())*.001);
        return (int) ((cal.getTimeInMillis())*.001);
	}
	
	/*
	 * 
	 */
	public void determineLikelyFlight() throws IOException, org.json.simple.parser.ParseException, ParseException, NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		try {
			String inputLine;
			String url = null;
			String s1=null;
			String s2=null;
			
	        // needed when on Sabre network
			System.getProperties().put("http.proxyHost", "www-ad-proxy.sabre.com");
			System.getProperties().put("http.proxyPort", "80");
			System.getProperties().put("http.proxyUser", "sg0XXXXXX");
			System.getProperties().put("http.proxyPassword", "PWD");

			
			/*	Check:
			 * 		Time Basis 
			 * 		Origin Airport
			 * 		Destination Airport
			 * 		Airline Carrier
			 * 			
			 */
			if(!flightNumber.isEmpty()) {
				
				url = "http://flightxml.flightaware.com/json/FlightXML2/FlightInfo?" +
            			"ident="+ flightNumber + 
            			"&howMany=10";
	           	s1 = "FlightInfoResult";
	           	s2 = "flights";
			}
			else if(!originAirport.isEmpty()) {
            	
    			url = "http://flightxml.flightaware.com/json/FlightXML2/Departed?" +
    					"airport="+originAirport +
    					"&howMany=10" +
    					"&filter=" +
    					"&offset=0";
    			s1 = "DepartedResult";
    			s2 = "departures";
            }
            else if(!destinationAirport.isEmpty()) {
            	
    			url = "http://flightxml.flightaware.com/json/FlightXML2/Arrived?" +
    					"airport=" + destinationAirport +
    					"&howMany=10" +
    					"&filter=" +
    					"&offset=0";
    			s1 = "ArrivedResult";
    			s2 = "arrivals";
            }
			else if(!airline.isEmpty()) {

				url = "http://flightxml.flightaware.com/json/FlightXML2/FleetArrived?" +
						"fleet="+airline +
						"&howMany=15" +
						"&offset=0";
				s1 = "FleetArrivedResult";
				s2 = "arrivals";
			}
//			else if(endTime != 0 && startTime !=0 && (!airline.isEmpty() || !originAirport.isEmpty() || !destinationAirport.isEmpty())) {
//				
//				// sometimes this one doesn't work :/
//				
//	           	url = "http://flightxml.flightaware.com/json/FlightXML2/AirlineFlightSchedules?" +
//            			"startDate="+ startTime +
//            			"&endDate=" + endTime +
//            			"&origin="  + originAirport +
//            			"&destination="+destinationAirport +
//            			"&airline=" + airline +
//            			"&flightno=" +
//            			"&howMany=15" +
//            			"&offset=0";
//	           	s1 = "";
//	           	s2 = "";
//			}
			else {
				// no matching flights found
				return;
			}
            
			if(!url.isEmpty()) {
            	System.out.println(url);
				URL http = new URL(url);
				HttpURLConnection con = (HttpURLConnection) http.openConnection();
					con.setRequestMethod("GET");
			        con.setRequestProperty("Authorization", "Basic " + authEncoded);
					con.setRequestProperty("User-Agent", "Mozilla/5.0");
					con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
					con.setDoOutput(true);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuffer response = new StringBuffer();
					while ((inputLine = in.readLine()) != null) {
						response.append(inputLine);
					}
					in.close();
					
					System.out.println("resp: " + response.toString());
				
				// parse JSON response here
				JSONParser parser = new JSONParser();
					Object obj = parser.parse(response.toString());
					JSONObject jsonObject = (JSONObject) obj;
				
				JSONObject json = (JSONObject) jsonObject.get(s1);
					JSONArray msg = (JSONArray) json.get(s2);
					Iterator<Object> iterator = msg.iterator();
					JSONObject js = null;
						while (iterator.hasNext()) {
							js = (JSONObject) iterator.next();
							likely.add((String) js.get("ident"));
						}
						
						for(int j=0; j < likely.size(); j++) {
							mk = mk - current;
							checkLikely(likely.get(j), j);
						}
						
						// store results to database
						parseStoreDB();
						
						// clear arrays
						likely.clear();
						flights.clear();
			}
						
        } catch (java.rmi.RemoteException x) {
            System.err.println(x);
        }
    }
	
	/*
	 * 
	 */
	public void checkLikely(String likely, int index) throws IOException, org.json.simple.parser.ParseException {
		
		String inputLine = null;
		String url = null;

		url = "http://flightxml.flightaware.com/json/FlightXML2/FlightInfoEx?" +
				"ident=" + likely +
				"&howMany=1" +
				"&offset=0";
		
		URL http = new URL(url);
		HttpURLConnection con = (HttpURLConnection) http.openConnection();
			con.setRequestMethod("GET");
	        con.setRequestProperty("Authorization", "Basic " + authEncoded);
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			con.setDoOutput(true);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
	
		// parse JSON response here
		JSONParser parser = new JSONParser();
			Object obj = parser.parse(response.toString());
			JSONObject jsonObject = (JSONObject) obj;
		
		JSONObject json = (JSONObject) jsonObject.get("FlightInfoExResult");
			JSONArray msg = (JSONArray) json.get("flights");
			Iterator<Object> iterator = msg.iterator();
			JSONObject js = null;

				while (iterator.hasNext()) {
					js = (JSONObject) iterator.next();
					
					// get a persentage of likeliness 
					remaining = match((String)js.get("ident"),(String)js.get("destination"), (String)js.get("origin"), endTime);
					
					if(mk > 0) {
		            	flights.add(tweetID+"/"+(String)js.get("ident")+"/"+(String)js.get("aircrafttype")+"/"+(String)js.get("origin")+"/"+(String)js.get("originCity")
		        			+"/"+(String)js.get("destination")+"/"+(String)js.get("destinationCity")+"/"+js.get("filed_departuretime")
		        			+"/"+js.get("filed_time")+"/"+current);
					}
				}
	}
	
	/*
	 * 
	 */
	private int match(String flightNum, String dest, String origin, int dept_time) {
		
		
		if(flightNumber.contains(flightNum)) {
			
			current = 100;
			return remaining;
		}
		if( originAirport.endsWith(origin) && destinationAirport.endsWith(dest) && ( (endTime-dept_time) < 3000) && flightNum.contains(airline)) {
			
			current = 90;
			if(remaining <= 90)
				return remaining;
			else
				return (remaining - 90);
		}
		if( originAirport.endsWith(dest) && destinationAirport.endsWith(origin) && ( (endTime-dept_time) < 3000) && flightNum.contains(airline) ) {
			
			current =90;
			if(remaining <= 90)
				return remaining;
			else
				return (remaining - 90);
		}
		if( originAirport.endsWith(dest) || destinationAirport.endsWith(origin) || originAirport.endsWith(origin) || destinationAirport.endsWith(dest) ) {
			
			current = 50;
			if(remaining <= 50)
				return remaining;
			else
				return (remaining - 50);
		}
		if( flightNum.contains(airline) ) {
			
			current = 30;
			if(remaining <= 30)
				return remaining;
			else
				return (remaining - 30);

		}
		else {
			current = 20;
			if(remaining <= 20)
				return remaining;
			else
				return (remaining - 20);
		}
	}
	
	/*
	 * 
	 */
	public void parseStoreDB() throws NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		ArrayList<String> arr = new ArrayList<String>();
		StoreToDB db = new StoreToDB();
		String[] tokens = null;
		
		for(int i=0; i < flights.size(); i++) {
			
			tokens = flights.get(i).split("/");
			for (String t : tokens) {
				arr.add(t);
			}
			
			db.writeAirlineData(arr.get(0),arr.get(1), arr.get(2), arr.get(3), arr.get(4),arr.get(5), 
					arr.get(6), arr.get(7), arr.get(8),Integer.parseInt(arr.get(9)));
		}
	}
	
	public static void main(String args[]) throws NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException, org.json.simple.parser.ParseException, ParseException, SQLException {
		
		AirlineMatcher aa = new AirlineMatcher("123", "AA","AAL567", "DFW", "SEA", "Sat Jun 12 12:00:20 +0000 2013");
		aa.determineLikelyFlight();
	}

}
