/*
 * Copyright 2013 Sabre Holdings
 */

/**
 * Collection of utilities.
 * 
 * @author Qing Ke (Qing.Ke@sabre.com)
 * 
 */
public class Utils {

	/** Strip leading and trailing punctuation except '@' and '#'. */
	public static String strip(String s) {
		return s.replaceFirst("^[^a-zA-Z@#0-9]+", "").replaceAll(
				"[^a-zA-Z@#0-9]+$", "");
	}

	/** Strip leading and trailing punctuation and numbers. */
	public static String stripFully(String s) {
		return s.replaceFirst("^[^a-zA-Z]+", "").replaceAll("[^a-zA-Z]+$", "");
	}

	/** Strip leading and trailing punctuation */
	public static String stripPunct(String s) {
		return s.replaceFirst("^[^a-zA-Z0-9]+", "").replaceAll(
				"[^a-zA-Z0-9]+$", "");
	}

	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException exception) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "@westjet trying the Encore service from #YVR to Fort St John. Connector through #CGY flight #286. #Delayed Hope I catch the #3101 to #FSJ.";
		System.out.println(strip("@westjet"));
		System.out.println(strip("trying"));
		System.out.println(strip("Encore"));
		System.out.println(strip("#YVR"));
		System.out.println(strip("#286."));
		System.out.println(strip("#FSJ..."));
		System.out.println(stripPunct("#286."));
	}

}
