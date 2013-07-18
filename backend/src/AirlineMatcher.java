/*
 * Copyright 2013 Sabre Holdings
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.flightaware.flightxml.soap.FlightXML2.AirlineFlightScheduleStruct;
import com.flightaware.flightxml.soap.FlightXML2.AirlineFlightSchedulesRequest;
import com.flightaware.flightxml.soap.FlightXML2.AirlineInsightRequest;
import com.flightaware.flightxml.soap.FlightXML2.AirlineInsightStruct;
import com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineFlightScheduleStruct;
import com.flightaware.flightxml.soap.FlightXML2.ArrayOfAirlineInsightStruct;
import com.flightaware.flightxml.soap.FlightXML2.ArrayOfRoutesBetweenAirportsExStruct;
import com.flightaware.flightxml.soap.FlightXML2.ArrivalFlightStruct;
import com.flightaware.flightxml.soap.FlightXML2.ArrivalStruct;
import com.flightaware.flightxml.soap.FlightXML2.ArrivedRequest;
import com.flightaware.flightxml.soap.FlightXML2.DepartedRequest;
import com.flightaware.flightxml.soap.FlightXML2.DepartureFlightStruct;
import com.flightaware.flightxml.soap.FlightXML2.DepartureStruct;
import com.flightaware.flightxml.soap.FlightXML2.EnrouteFlightStruct;
import com.flightaware.flightxml.soap.FlightXML2.EnrouteRequest;
import com.flightaware.flightxml.soap.FlightXML2.EnrouteStruct;
import com.flightaware.flightxml.soap.FlightXML2.FlightExStruct;
import com.flightaware.flightxml.soap.FlightXML2.FlightInfoExRequest;
import com.flightaware.flightxml.soap.FlightXML2.FlightInfoExStruct;
import com.flightaware.flightxml.soap.FlightXML2.FlightXML2Locator;
import com.flightaware.flightxml.soap.FlightXML2.FlightXML2Soap;
import com.flightaware.flightxml.soap.FlightXML2.FlightXML2SoapStub;
import com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExRequest;
import com.flightaware.flightxml.soap.FlightXML2.RoutesBetweenAirportsExStruct;


/**
 * Submit to FlghtAware.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 *
 */
public class AirlineMatcher {
	
/*
	//	private static JSONObject tweet = null;
		private static String airline = null;
		private static String flightNumber = null;
		private static String originAirport = null;
		private static String destinationAirport = null;
		private static int startTime = 0;	// has to be unix time stamps
		private static int endTime = 0;		// tweet post time -- has to be unix time stamps
	*/
	
	
	private static String airline = "AAL";
	private static String flightNumber = "AAL2356";
	private static String originAirport = null;
	private static String destinationAirport = null;
	private static int startTime = 0;	// has to be unix time stamps
	private static int endTime = 1374160584;		// tweet post time -- has to be unix time stamps
	
	
	static ArrayList<String> likely = new ArrayList<String>();
	static ArrayList<String> flights = new ArrayList<String>();
	
	public AirlineMatcher(String airline, String flightNumber, String originAirport,
			String destinationAirport, String originCity, String destinationCity, int endTime) {
	//	this.tweet = tweet;
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.endTime = endTime;
	}
	
	/*
	 * 
	 */
	public static void determineStartTime() {

		/*
		 * Determine Start time to be 
		 * 6 hours before tweet post
		 */
		
        long ltime = (long) (endTime / .001);
        
        Date date = new Date(ltime);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, -6);

        startTime = (int) ((cal.getTimeInMillis())*.001);
	}
	
	/*
	 * 
	 */
	public static void determineLikelyFlight() {
		
		String tweetID = generateTweetID();
		int metric=0;

		try {
            FlightXML2Locator locator = new FlightXML2Locator();
            FlightXML2Soap df = locator.getFlightXML2Soap();
            FlightXML2SoapStub stub = (FlightXML2SoapStub)df;
	            stub.setUsername("markmcspadden");                                                                                                                                                                             
	            stub.setPassword("67335dec3f3b762a4fb496e9f17c66594ad903a4");    
	         
	     
	        // needed when on Sabre network
			System.getProperties().put("http.proxyHost", "www-ad-proxy.sabre.com");
			System.getProperties().put("http.proxyPort", "80");
			System.getProperties().put("http.proxyUser", "sg0219486");
			System.getProperties().put("http.proxyPassword", "Calcifer56");
           
            // get startTime
            determineStartTime();
            
            /**
             * get likely flights
             */
            if(!flightNumber.isEmpty()) {
            	
            	likely.add(flightNumber);
            }
            else if(!originAirport.isEmpty() && !destinationAirport.isEmpty()) {
            	
            	ArrayOfAirlineFlightScheduleStruct rr = df.airlineFlightSchedules( new AirlineFlightSchedulesRequest(startTime,endTime,"K"+originAirport,"K"+destinationAirport,
                		airline,flightNumber,15,0)).getAirlineFlightSchedulesResult();
            			
	                for (AirlineFlightScheduleStruct f: rr.getData()) {
	                	
	                	// save flight number
	                	likely.add(f.getIdent());
	                }
	                
            }
            else if(!airline.isEmpty()) {
            	
            	ArrayOfAirlineFlightScheduleStruct rr = df.airlineFlightSchedules( new AirlineFlightSchedulesRequest(startTime,endTime,"K"+originAirport,"K"+destinationAirport,
                		airline,flightNumber,15,0)).getAirlineFlightSchedulesResult();
            			
	                for (AirlineFlightScheduleStruct f: rr.getData()) {
	                	
	                	// save flight number
	                	likely.add(f.getIdent());
	                }
	                
            }
            else if(!originAirport.isEmpty()) {
            	
            	DepartureStruct d = df.departed(new DepartedRequest(originAirport, 15, "", 0)).getDepartedResult();
            	// Get the list of enroute aircraft when only airport is known
                for (DepartureFlightStruct e: d.getDepartures()) {
                	
                	likely.add(e.getIdent());
                }
            }
            else if(!destinationAirport.isEmpty()) {
            	
            	ArrivalStruct a = df.arrived(new ArrivedRequest(destinationAirport, 15, "", 0)).getArrivedResult();
                for (ArrivalFlightStruct e: a.getArrivals()) {
                	
                	likely.add(e.getIdent());
                }
            }

            /**
             * Get flight data for likely flights
             * and determine metric
             */
            for(int i=0; i < likely.size(); i++) {
            	
                FlightInfoExStruct flight = df.flightInfoEx(new FlightInfoExRequest(likely.get(i),1,0)).getFlightInfoExResult();	
                for(FlightExStruct e1: flight.getFlights()) {
                	
		            	metric = match(e1.getIdent(), e1.getDestination(), e1.getOrigin(), e1.getFiled_departuretime());
		 
		            	flights.add(tweetID+"|"+e1.getIdent()+"|"+e1.getAircrafttype()+"|"+e1.getOrigin()+"|"+e1.getOriginCity()
		            			+"|"+e1.getDestination()+"|"+ e1.getDestinationCity()+"|"+e1.getFiled_departuretime()
		            			+"|"+e1.getFiled_time()+"|"+metric);
		        	}
                }

        } catch (javax.xml.rpc.ServiceException x) {
            System.err.println(x);
        } catch (java.rmi.RemoteException x) {
            System.err.println(x);
        }
    }
	
	/*
	 * 
	 */
	private static String generateTweetID() {
		
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
			for (int i = 0; i < 25; i++) {
			    char c = chars[random.nextInt(chars.length)];
			    sb.append(c);
			}

		return sb.toString();
	}

	/*
	 * 
	 */
	private static int match(String flightNum, String dest, String origin, int dept_time) {
		
		/*
		 * very arbitrary way of determining
		 * metric of possible flights
		 */
		
		int i=0;
		
		if(flightNumber.equals(flightNum)) {
			
			i = 100;
		}
		else if( ( ("K"+originAirport).equals(origin) && ("K"+destinationAirport).equals(dest)) && ( (endTime-dept_time) < 6000) ) {
			
			i = 90;
		}
		else if( ( ("K"+originAirport).equals(dest) && ("K"+destinationAirport).equals(origin)) && ( (endTime-dept_time) < 6000) ) {
			
			i = 90;
		}
		else if( ( ("K"+originAirport).equals(dest) && ("K"+destinationAirport).equals(origin))) {
			
			i = 80;
		}
		else if( ( ("K"+originAirport).equals(origin) && ("K"+destinationAirport).equals(dest))) {
			
			i = 80;
		}
		else {
			i=40;
		}
		
		return i;
	}
	
	/*
	 * 
	 */
	public static void parseStoreDB() throws NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		String store = "";
		ArrayList<String> arr = new ArrayList<String>();
		StoreToDB db = new StoreToDB();
		
		
		String[] tokens = null;
		
		for(int i=0; i < flights.size(); i++) {
			
			tokens = flights.get(i).split("|");
			for (String t : tokens) {
				arr.add(t);
			}
			
			db.writeAirlineData(arr.get(0),arr.get(1), arr.get(2), arr.get(3), arr.get(4),arr.get(5), 
					arr.get(6), arr.get(7), arr.get(8),Integer.parseInt(arr.get(9)));
							
		}
	}
	
	/*
	 * 
	 */
	public static void main(String args[]) throws NumberFormatException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		determineLikelyFlight();
		parseStoreDB();
		
	}
	
}
