/*
 * Copyright 2013 Sabre Holdings
 */

import twitter4j.internal.org.json.JSONObject;


/**
 * Submit to FlghtAware.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 *
 */
public class AirlineMatcher {

	private JSONObject tweet = null;
	private String airline = null;
	private String flightNumber = null;
	private String originAirport = null;
	private String destinationAirport = null;
	private String originCity = null;
	private String destinationCity = null;

	public AirlineMatcher() {
		
	}

	public AirlineMatcher(JSONObject tweet, String airline,
			String flightNumber, String originAirport,
			String destinationAirport, String originCity, String destinationCity) {
		this.tweet = tweet;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.originCity = originCity;
		this.destinationCity = destinationCity;
	}

	
}

