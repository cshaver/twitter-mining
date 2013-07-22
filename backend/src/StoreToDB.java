/*
 * Copyright 2013 Sabre Holdings
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Write to database
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class StoreToDB {
	
	private static String dbName = "twitter_data";
	private static String url = "jdbc:mysql://localhost:3306/"+dbName;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String userName = "root";
    private static String password = "";
    
	/*
	 * 
	 */
	public void writeTwitterData(String tweet, String date, String location, String username,
			String sentiment_type, String keywords, int numFollowers) throws InstantiationException, 
			IllegalAccessException, ClassNotFoundException, SQLException {
	
		java.sql.PreparedStatement insertData = null;
	    String tblName = "airline_tweets";
	    String insertString = "INSERT into "+ dbName + "." + tblName+ " VALUES(ID,?,?,?,?,?,?,?)";

	    
		    try {
		    	
				Class.forName(driver).newInstance();
		        Connection con = DriverManager.getConnection(url,userName,password);
	
		        insertData = con.prepareStatement(insertString);
			      //  insertData.setInt(1, id);
			        insertData.setString(1, tweet);
			        insertData.setString(2, date);
			        insertData.setString(3, location);
			        insertData.setString(4, username);
			        insertData.setString(5, sentiment_type);
			        insertData.setString(6, keywords);
			        insertData.setInt(7, numFollowers);
			        insertData.executeUpdate();
	
		    } catch (SQLException e ) {
		    	
		    	System.err.println(e.getMessage());
		
		    } finally {
		        if (insertData != null) {
		        	insertData.close();
		        }
		    }
	}
	
	/*
	 * 
	 */
	public void writeAirlineData(String tweet_id,String flightNumber, String planeType, String origin_air, String origin_city,
			String dest_air, String dest_city, String dept_time, String arr_time,int metric) 
					throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		java.sql.PreparedStatement insertData = null;
	    String tblName = "airline_data";
	    
	    String insertString =
	        "INSERT into "+ dbName + "." + tblName+ " VALUES(ID,?,?,?,?,?,?,?,?,?,?)";
	    
	        try {
		    	
				Class.forName(driver).newInstance();
		        Connection con = DriverManager.getConnection(url,userName,password);
	
		        insertData = con.prepareStatement(insertString);
			       // insertData.setInt(1, id);
			        insertData.setString(1, tweet_id);
			        insertData.setString(2, flightNumber);
			        insertData.setString(3, planeType);
			        insertData.setString(4, origin_air);
			        insertData.setString(5, origin_city);
			        insertData.setString(6, dest_air);
			        insertData.setString(7, dest_city);
			        insertData.setString(8, dept_time);
			        insertData.setString(9, arr_time);
			        insertData.setInt(10, metric);
			        insertData.executeUpdate();
	
		    } catch (SQLException e ) {
		    	System.err.println(e.getMessage());
		
		    } finally {
		        if (insertData != null) {
		        	insertData.close();
		        }
		    }
	}
	
}
