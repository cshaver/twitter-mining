/*
 * Copyright 2013 Sabre Holdings
 */

import java.io.File;

/**
 * All of the used constants.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class Constants {

	/** delimiter used to separate fields */
	public static final String DELIMITER = "\t";

	/** end of line */
	public static final String EOL = "\n";

	/** number of tweets in a single file */
	public static final int NUMBER_OF_TWEETS_PER_FILE = 100000;

	/** Twitter Date Format */
	public static final String TWITTER_DATE_FORMAT = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";

	/** root directory for tweets files */
	public static final String TWEETS_DATA_DIR = "data";

	/** root directory for keywords files */
	public static final String KEYWORDS_DATA_DIR = "keywords";

	/** File path for airport data */
	public static final String KEYWORDS_AIRPORT_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "airport-all.txt";

	/** File path for airline twitter data */
	public static final String KEYWORDS_AIRLINE_TWITTER_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "airlines-twitter-man.txt";

	/** File path for airline code data */
	public static final String KEYWORDS_AIRLINE_CODE_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "airlines-codes-small.txt";

	public static final String KEYWORDS_GENERAL_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "general.txt";

}
