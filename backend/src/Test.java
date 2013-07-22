/*
 * Copyright 2013 Sabre Holdings
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Local code snippet test.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
 * 
 */
public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		String a = "Sat May 18 22:31:20 +0000 2013";
		SimpleDateFormat sf = new SimpleDateFormat(
				Constants.TWITTER_DATE_FORMAT);
		sf.setLenient(true);
		Date d = sf.parse(a);
		System.out.println(d.getTime());
	}

}
