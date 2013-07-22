/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.IOException;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Getting tweets using Twitter search API.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class StatusSearcher {

	public StatusSearcher() {

	}

	private Query getQuery() throws IOException {
		// String keywords =
		// "flight delay OR flight customer service OR flight baggage OR  flight baggages OR flight attendant OR flight board OR flight boarding";
		String keywords = "flight :) OR flight :(";
		Query query = new Query(keywords);
		query.setLang("en");
		query.setCount(100);
		return query;
	}

	public void search() throws IOException, TwitterException {
		Twitter twitter = TwitterFactory.getSingleton();
		Query query = getQuery();
		QueryResult result = twitter.search(query);
		for (Status status : result.getTweets()) {
			System.out.println("@" + status.getUser().getScreenName() + ":"
					+ status.getText());
		}
	}

	public static void main(String[] args) throws IOException, TwitterException {
		StatusSearcher downloader = new StatusSearcher();
		downloader.search();
	}
}
