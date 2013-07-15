/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import twitter4j.FilterQuery;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

/**
 * Stream tweets using filter API.
 * 
 * @author Qing Ke (Qing.Ke@sabre.com)
 * 
 */
public class StatusDownloader {

	public StatusDownloader() {

	}

	private String[] getTrack() throws IOException {
		List<String> track = new ArrayList<String>();
		String keywordsFilePath = "keywords" + File.separator
				+ "query-keywords-3.txt";
		BufferedReader br = new BufferedReader(new FileReader(keywordsFilePath));
		while (br.ready()) {
			track.add(br.readLine());
		}
		br.close();
		return track.toArray(new String[track.size()]);
	}

	public void download() throws IOException {
		TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		StatusListener listener = new FileStatusListener();
		twitterStream.addListener(listener);
		FilterQuery query = new FilterQuery();
		query.track(getTrack());
		twitterStream.filter(query);
	}

	public static void main(String[] args) throws IOException {
		StatusDownloader downloader = new StatusDownloader();
		downloader.download();
	}

}
