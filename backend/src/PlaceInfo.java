/*
 * Copyright 2013 Sabre Holdings
 */

/**
 * Wrapper for airport and city name.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class PlaceInfo {

	private String airport = null;
	private String city = null;

	public PlaceInfo() {

	}

	public PlaceInfo(String city) {
		this.airport = null;
		this.city = city;
	}

	public PlaceInfo(String airport, String city) {
		this.airport = airport;
		this.city = city;
	}

	/** Returns if airport info is available */
	public boolean isAirportAvailable() {
		return airport != null ? true : false;
	}

	/** Getters and Setters */
	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "[airport=" + airport + "; city=" + city + "]";
	}

}
