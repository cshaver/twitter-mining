/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.json.DataObjectFactory;

/**
 * Write tweets to raw json files.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class FileStatusListener implements StatusListener {

	private BufferedWriter tweetsWriter = null;
	private int tweetsCounter = -1;

	public FileStatusListener() throws IOException {
		init();
	}

	@Override
	public void onStatus(Status status) {
		try {
			tweetsWriter.write(DataObjectFactory.getRawJSON(status)
					+ Constants.EOL);
			tweetsCounter++;
			if (tweetsCounter >= Constants.NUMBER_OF_TWEETS_PER_FILE) {
				end();
				init();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onException(Exception e) {
		e.printStackTrace();
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice notice) {
		System.out.println("status deleted: " + notice.getStatusId());
	}

	@Override
	public void onScrubGeo(long userId, long upToStatusId) {
		System.out.println("lacation deleted: " + userId + ", " + upToStatusId);
	}

	@Override
	public void onStallWarning(StallWarning warning) {
		System.out.println("stall warning: " + warning.getMessage());
	}

	@Override
	public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
		System.out.println("# of limited statuses: " + numberOfLimitedStatuses);
	}

	private void init() throws IOException {
		FileOutputStream fos = new FileOutputStream(getFileName());
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		tweetsWriter = new BufferedWriter(osw);
		tweetsCounter = 0;
	}

	private void end() throws IOException {
		tweetsWriter.flush();
		tweetsWriter.close();
	}

	private String getFileName() {
		DateFormat df = new SimpleDateFormat("yyyyMMdd-HHmmss");
		return "data" + File.separator + "raw-tweets-" + df.format(new Date())
				+ ".txt";
	}
}
