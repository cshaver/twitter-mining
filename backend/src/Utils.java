/*
 * Copyright 2013 Sabre Holdings
 */

/**
 * Collection of utilities.
 * 
 * @author Sabre Labs Twitter Mining Team - 2
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

	/** Strip leading and trailing letters */
	public static String stripLetters(String s) {
		return s.replaceFirst("^[^0-9]+", "").replaceAll("[^0-9]+$", "");
	}

	/** Returns given string can be parsed to integer */
	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException exception) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(strip("@westjet"));
		System.out.println(strip("trying"));
		System.out.println(strip("Encore"));
		System.out.println(strip("#YVR"));
		System.out.println(strip("#286."));
		System.out.println(strip("#FSJ..."));
		System.out.println(stripPunct("#286."));
		System.out.println(stripLetters("A380."));
		System.out.println(stripLetters("AA2413."));
		System.out.println(stripLetters("#2413."));
	}

}
