import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author Qing Ke (Qing.Ke@sabre.com)
 * 
 */
public class KeywordsDatabase {

	/** Airport Code -> City Name */
	private Map<String, String> airportCodeToCity = null;

	/** Set of airport names */
	private Set<String> airportName = null;

	/** Twitter screen name -> Airline name */
	private Map<String, String> twitterNameToAirline = null;

	/** Airline name -> Airline Code */
	private Map<String, String> airlineNameToCode = null;

	/** Set of cities where airports located */
	private Set<String> cityName = null;

	public KeywordsDatabase() {
		airportCodeToCity = new HashMap<String, String>();
		twitterNameToAirline = new HashMap<String, String>();
		airlineNameToCode = new TreeMap<String, String>(
				String.CASE_INSENSITIVE_ORDER);
		airportName = new HashSet<String>();
		cityName = new HashSet<String>();
	}

	public KeywordsDatabase(String airportFilePath,
			String twitterAirlineFilePath, String airlineCodeFilePath)
			throws IOException {
		this();
		loadAirport(airportFilePath);
		loadTwitterAirline(twitterAirlineFilePath);
		loadAirlineCode(airlineCodeFilePath);
	}

	public boolean isAirportCode(String code) {
		return airportCodeToCity.containsKey(code);
	}

	public boolean isAirportName(String name) {
		return airportName.contains(name);
	}

	public boolean isCityName(String name) {
		return cityName.contains(name);
	}

	public String getCity(String code) {
		return airportCodeToCity.get(code);
	}

	public boolean isTwitterAccount(String twitterAccount) {
		return twitterNameToAirline.containsKey(twitterAccount);
	}

	public String getAirlineFromTwitterName(String twitterName) {
		return twitterNameToAirline.get(twitterName);
	}

	public boolean isAirlineName(String name) {
		return airlineNameToCode.containsKey(name);
	}

	private void loadAirport(String airportFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(airportFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			String[] fields = br.readLine().split(Constants.DELIMITER);
			airportCodeToCity.put(fields[0], fields[2]);
			cityName.add(fields[2]);
			airportName.add(fields[1]);
		}
		br.close();
		isr.close();
		fis.close();
	}

	private void loadTwitterAirline(String twitterAirlineFilePath)
			throws IOException {
		FileInputStream fis = new FileInputStream(twitterAirlineFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			String[] fields = br.readLine().split(Constants.DELIMITER);
			twitterNameToAirline.put(fields[0], fields[1]);
		}
		br.close();
	}

	private void loadAirlineCode(String airlineCodeFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(airlineCodeFilePath);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		while (br.ready()) {
			String[] fields = br.readLine().split(Constants.DELIMITER);
			airlineNameToCode.put(fields[1], fields[0]);
		}
		br.close();
	}

	public static void main(String[] args) throws IOException {
	}
}
