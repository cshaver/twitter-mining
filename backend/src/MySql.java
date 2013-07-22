/*
 * Copyright 2013 Sabre Holdings
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Getting data from database.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class MySql {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public void readDataBase() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/twitter_data?" + "user=root");

			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from twitter_data.airline_tweets");
			while (resultSet.next()) {
				String id = resultSet.getString("ID");
				String tweet = resultSet.getString("Tweet");
				String date = resultSet.getString("Date");
				String loc = resultSet.getString("Location");
				String userName = resultSet.getString("Username");
				String sentimentType = resultSet.getString("sentiment_Type");
				String keywords = resultSet.getString("Keywords");
				int num_Followers = resultSet.getInt("Num_Follower");
				System.out.println("id: " + id);
				System.out.println("tweet: " + tweet);
				System.out.println("date: " + date);
				System.out.println("loc: " + loc);
				System.out.println("userName: " + userName);
				System.out.println("sentiment Type: " + sentimentType);
				System.out.println("keywords: " + keywords);
				System.out.println("# Followers: " + num_Followers);
				System.out.println("extracted keywords: " + getKeyword(tweet));
				System.out.println();
			}
		} finally {
			close();
		}
	}

	private String getKeyword(String tweet) {
		StringBuilder keyword = new StringBuilder();
		String content = tweet.toLowerCase();
		if (content.contains("flight")) {
			keyword.append("flight, ");
		}
		if (content.contains("airport")) {
			keyword.append("airport, ");
		}
		if (content.contains("flying")) {
			keyword.append("flying, ");
		}
		if (content.contains("plane")) {
			keyword.append("plane, ");
		}
		if (content.contains("airplane")) {
			keyword.append("airplane, ");
		}
		if (content.contains("airline")) {
			keyword.append("airline, ");
		}
		if (content.contains("board")) {
			keyword.append("board, ");
		}
		if (content.contains("boarding")) {
			keyword.append("boarding, ");
		}
		if (content.contains("depart")) {
			keyword.append("depart, ");
		}
		if (content.contains("departing")) {
			keyword.append("departing, ");
		}
		if (content.contains("landing")) {
			keyword.append("landing, ");
		}
		if (content.contains("attendant")) {
			keyword.append("attendant, ");
		}
		if (content.contains("delay")) {
			keyword.append("delay, ");
		}
		return keyword.toString();
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws Exception {
		MySql dao = new MySql();
		dao.readDataBase();
	}

}