/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

/**
 * Calling API to get possible airports of given city.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class AirportFinder {

	private static final String httpAddr = " http://iphone.travelocity.com/JSON.jsp?method=cityNames&city=";

	public AirportFinder() {

	}

	public List<String> find(String city) throws IOException, JSONException {
		URL url = new URL(httpAddr + replaceSpace(city));
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String resp = br.readLine();
		conn.disconnect();
		return parse(resp);
	}

	private List<String> parse(String resp) throws JSONException {
		JSONObject jsonResp = new JSONObject(resp);
		JSONArray cities = jsonResp.getJSONArray("cities");
		if (cities.length() == 0)
			return null;

		List<String> results = new ArrayList<String>();
		for (int i = 0; i < cities.length(); ++i) {
			JSONObject city = cities.getJSONObject(i);
			if (city.getString("type").equals("ARP")) {
				results.add(city.getString("city").split(", ")[0]);
			}
		}
		return results.size() > 0 ? results : null;
	}

	private String replaceSpace(String s) {
		return s.replaceAll(" ", "%20");
	}

	public static void main(String[] args) throws IOException, JSONException {
//		System.getProperties().put("http.proxyHost", "www-ad-proxy.sabre.com");
//		System.getProperties().put("http.proxyPort", "80");
//		System.getProperties().put("http.proxyUser", "sg0XXXXXX");
//		System.getProperties().put("http.proxyPassword", "PWD");
		AirportFinder finder = new AirportFinder();
		System.out.println(finder.find("new%20york"));
		System.out.println(finder.find("new york"));
	}
}
