/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Collection of flight related keywords.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class KeywordsDatabase {

	/** Airport Code -> City Name */
	private Map<String, String> airportCodeToCity = null;

	/** Airport Code -> Airport Name */
	private Map<String, String> airportCodeToName = null;

	/** Set of airport names */
	private Set<String> airportName = null;

	/** Twitter screen name -> Airline name */
	private Map<String, String> twitterNameToAirline = null;

	/** Airline name -> Airline Code */
	private Map<String, String> airlineNameToCode = null;

	/** Set of cities where airports located */
	private Set<String> cityName = null;

	/** Set of general keywords */
	private Set<String> generalKeywords = null;

	/** Airport Name -> City */
	private Map<String, String> airportNameToCity= null;

	/** Set of airline code */
	private Set<String> airlineCode = null;

	/** Airline alias name (without space) -> Airline name*/
	private Map<String, String> airlineAliasToName = null;

	public KeywordsDatabase() {
		airportCodeToCity = new HashMap<String, String>();
		airportCodeToName = new HashMap<String, String>();
		twitterNameToAirline = new HashMap<String, String>();
		airlineNameToCode = new TreeMap<String, String>(
				String.CASE_INSENSITIVE_ORDER);
		airportName = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		cityName = new HashSet<String>();
		generalKeywords = new HashSet<String>();
		airportNameToCity = new HashMap<String, String>();
		airlineCode = new HashSet<String>();
		airlineAliasToName = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
	}

	public KeywordsDatabase(String airportFilePath,
			String twitterAirlineFilePath, String airlineCodeFilePath,
			String generalKeywordsFilePath) throws IOException {
		this();
		loadAirport(airportFilePath);
		loadTwitterAirline(twitterAirlineFilePath);
		loadAirlineCode(airlineCodeFilePath);
		loadGeneralKeywords(generalKeywordsFilePath);
	}

	public boolean isAirportCode(String code) {
		return airportCodeToCity.containsKey(code);
	}

	public String getAirportNameFromCode(String code) {
		return airportCodeToName.get(code);
	}

	public boolean isAirportName(String name) {
		return airportName.contains(name);
	}

	public boolean isCityName(String name) {
		return cityName.contains(name);
	}

	public boolean isGeneralKeyword(String name) {
		return generalKeywords.contains(name);
	}

	public String getCity(String code) {
		return airportCodeToCity.get(code);
	}

	public String getCityFromAirportName(String airport) {
		return airportNameToCity.get(airport);
	}

	public boolean isTwitterAccount(String twitterAccount) {
		return twitterNameToAirline.containsKey(twitterAccount);
	}

	public String getAirlineFromTwitterName(String twitterName) {
		return twitterNameToAirline.get(twitterName);
	}

	public boolean isAirlineName(String name) {
		return airlineNameToCode.containsKey(name);
	}

	public String getAirlineCodeFromName(String name) {
		return airlineNameToCode.get(name);
	}

	public boolean isAirlineCode(String code) {
		return airlineCode.contains(code);
	}

	public boolean isAirlineAlias(String name) {
		return airlineAliasToName.containsKey(name);
	}

	public String getArilineNameFromAlias(String name) {
		return airlineAliasToName.get(name);
	}

	private void loadAirport(String airportFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(airportFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			String[] fields = br.readLine().split(Constants.DELIMITER);
			String code = fields[0];
			String name = fields[1];
			String city = trimCityName(fields[4]);
			airportCodeToCity.put(code, city);
			cityName.add(city);
			airportName.add(name);
			airportCodeToName.put(code, name);
			airportNameToCity.put(name, city);
		}
		br.close();
		isr.close();
		fis.close();
	}

	private String trimCityName(String city) {
		for (int i = 0; i < city.length(); i++) {
			if (city.charAt(i) == ',') {
				return city.substring(0, i);
			}
		}
		return city;
	}

	private void loadTwitterAirline(String twitterAirlineFilePath)
			throws IOException {
		FileInputStream fis = new FileInputStream(twitterAirlineFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			String[] fields = br.readLine().split(Constants.DELIMITER);
			twitterNameToAirline.put(fields[0], fields[1]);
		}
		br.close();
	}

	private void loadAirlineCode(String airlineCodeFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(airlineCodeFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			String[] fields = br.readLine().split(Constants.DELIMITER);
			String name = fields[1];
			String code = Utils.stripPunct(fields[0]);
			airlineNameToCode.put(name, code);
			airlineCode.add(code);
			airlineAliasToName.put(name.replaceAll(" ", ""), name);
		}
		br.close();
	}

	private void loadGeneralKeywords(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			generalKeywords.add(br.readLine());
		}
		br.close();
	}

}
