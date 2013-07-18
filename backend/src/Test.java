import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd-HHmmss");
		System.out.println(df.format(new Date()));

		String content = "@westjet trying the Encore service from #YVR to Fort St John. Connector through #CGY flight #286. #Delayed Hope I catch the #3101 to #FSJ.";
		String[] words = content.split("\\s+");
		for (String word : words) {
			System.out.println(Utils.strip(word));
		}
	}

}
