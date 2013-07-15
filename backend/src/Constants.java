import java.io.File;

/*
 * Copyright 2013 Sabre Holdings
 */

/**
 * 
 * @author Qing Ke (Qing.Ke@sabre.com)
 * 
 */
public class Constants {

	/** delimiter used to separate fields */
	public static final String DELIMITER = "\t";

	/** end of line */
	public static final String EOL = "\n";

	/** number of tweets in a single file */
	public static final int NUMBER_OF_TWEETS_PER_FILE = 100000;

	/** root directory for tweets files */
	public static final String TWEETS_DATA_DIR = "data";

	/** root directory for keywords files */
	public static final String KEYWORDS_DATA_DIR = "keywords";

	/** File path for airport data */
	public static final String KEYWORDS_AIRPORT_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "airports.txt";

	/** File path for airline twitter data */
	public static final String KEYWORDS_AIRLINE_TWITTER_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "airlines-twitter-man.txt";

	/** File path for airline code data */
	public static final String KEYWORDS_AIRLINE_CODE_DATA_PATH = KEYWORDS_DATA_DIR
			+ File.separator + "airlines-codes-small.txt";

}
