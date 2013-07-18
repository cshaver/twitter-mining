import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 
 */
public class StoreToDB {
	
	private static String dbName = "twitter_data";
	private static String url = "jdbc:mysql://localhost:3306/"+dbName;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String userName = "root";
    private static String password = "";
    
    /*
     * Need to figure out how to generate
     * unique id to identify tweet and matching
     * flights 
     * 
     */
    private static int id;
	
	/*
	 * 
	 */
	public void writeTwitterData(String tweet, String date, String location, String username,
			String sentiment_type, String keywords, int numFollowers) throws InstantiationException, 
			IllegalAccessException, ClassNotFoundException, SQLException {
	
		java.sql.PreparedStatement insertData = null;
	    String tblName = "airline_tweets";
	    String insertString = "INSERT into "+ dbName + "." + tblName+ " VALUES(?,?,?,?,?,?,?,?)";

	    
		    try {
		    	
				Class.forName(driver).newInstance();
		        Connection con = DriverManager.getConnection(url,userName,password);
	
		        insertData = con.prepareStatement(insertString);
			        insertData.setInt(1, id);
			        insertData.setString(2, tweet);
			        insertData.setString(3, date);
			        insertData.setString(4, location);
			        insertData.setString(5, username);
			        insertData.setString(6, sentiment_type);
			        insertData.setString(7, keywords);
			        insertData.setInt(8, numFollowers);
			        insertData.executeUpdate();
	
		    } catch (SQLException e ) {
		
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
	        "INSERT into "+ dbName + "." + tblName+ " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	    
	        try {
		    	
				Class.forName(driver).newInstance();
		        Connection con = DriverManager.getConnection(url,userName,password);
	
		        insertData = con.prepareStatement(insertString);
			        insertData.setInt(1, id);
			        insertData.setString(2, tweet_id);
			        insertData.setString(3, flightNumber);
			        insertData.setString(4, planeType);
			        insertData.setString(5, origin_air);
			        insertData.setString(6, origin_city);
			        insertData.setString(7, dest_air);
			        insertData.setString(8, dest_city);
			        insertData.setString(9, dept_time);
			        insertData.setString(10, arr_time);
			        insertData.setInt(11, metric);
			        insertData.executeUpdate();
	
		    } catch (SQLException e ) {
		
		    } finally {
		        if (insertData != null) {
		        	insertData.close();
		        }
		    }
	}
	
	/*
	 * 
	 */
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		java.sql.PreparedStatement insertData = null;
	    String tblName = "tweet";

	    String insertString =
	        "INSERT into "+ dbName + "." + tblName+ " VALUES(?,?)";
	    
		    try {
		    	
				Class.forName(driver).newInstance();
		        Connection con = DriverManager.getConnection(url,userName,password);
	
		        insertData = con.prepareStatement(insertString);
			    //    insertData.setString(1, "random test");
			        insertData.setString(2, "ppppppppppppppppp");
			        insertData.executeUpdate();
	
		    } catch (SQLException e ) {
		
		    } finally {
		        if (insertData != null) {
		        	insertData.close();
		        }
		    }
	}
}
