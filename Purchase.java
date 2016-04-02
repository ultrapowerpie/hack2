// Do I need IO?
//import java.io.*;

import java.net.*;
import java.io.*;

public class Purchase {
	
	private static String key = "key=26919f14786c1d9c548f0e653e67c78d";
	private static URL url;
	
	// Parameter: ID of account that made purchases for user
	// Returns: URL for request to get all purchases by user
	public static URL makeURL(String account_id) throws Exception {
		String prefix = "http://api.reimaginebanking.com/accounts/";
		String suffix = "/purchases?";
		String spec = prefix + account_id + suffix + key;
		url = new URL(spec);
		return url;
	}
	
	// Note: must throw exception for all Net functions because of issues
	// http://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
	
	// Parameter: ID of account that made purchases for user
	// Returns: String represenation of json objects for all purchases made by user
	// CHANGE RETURN VALUE TYPE
	public static String getHistory(String account_id) throws Exception {
		URL url = makeURL(account_id);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		int responseCode = conn.getResponseCode();
		if (responseCode != 200) {
			return "INVALID ID";
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String bodyLine;
		StringBuffer response = new StringBuffer();
		while ((bodyLine = in.readLine()) != null) {
			response.append(bodyLine);
		}
		in.close();
		return response.toString();
	}
	
	public static String getPurchase(String account_id, String merchant_id) {
	}
	
	public static void main(String[] args) throws Exception {
		String account_id = "56c66be7a73e492741508217";
		System.out.println(makeURL(account_id));
		System.out.println(getHistory(account_id));
	}
}
