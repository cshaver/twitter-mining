import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class SentimentAnalyzer {
 
  public static void main(String[] args) throws Exception {
		
		SentimentAnalyzer http = new SentimentAnalyzer();
		System.out.println(http.getSentiment("i love pizza!"));
	} 
			
	private String getSentiment(String tweet) throws Exception {
		
		// needed when on Sabre network
		System.getProperties().put("http.proxyHost", "www-ad-proxy.sabre.com");
		System.getProperties().put("http.proxyPort", "80");
		System.getProperties().put("http.proxyUser", "sg0219486");
		System.getProperties().put("http.proxyPassword", "Calcifer56");
		
		String text = URLEncoder.encode(tweet, "ISO-8859-1");
		String key = "0466e03a0f680707977ff2b8878ec804283538f1";
		String url = "http://access.alchemyapi.com/calls/text/TextGetTextSentiment?apikey="+key+"&outputMode=json&showSourceText=1&text="+text;

		URL obj = new URL(url);	
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			con.setDoOutput(true);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		//System.out.println(response.toString());
		
		return extract(response.toString());
 
	}
	
	public String extract(String response) {
		 
		String status = null;
		String type = null;
		String mixed = null;
		
		JSONParser parser = new JSONParser();
	 
		try {
	 
			Object obj = parser.parse(response);
	 
			JSONObject jsonObject = (JSONObject) obj;
	 		status = (String) jsonObject.get("status");
	
			JSONObject json = (JSONObject) jsonObject.get("docSentiment");
				type = (String) json.get("type");
				mixed = (String)json.get("mixed");
				
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(!status.equals("OK"))
			return "Sentiment Could Not be Analyzed";
		else
			return type+"/"+mixed;
	}
}
