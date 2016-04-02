// Do I need IO?
//import java.io.*;

import java.net.*;

public class Purchase {
	
	private static String key = "key=26919f14786c1d9c548f0e653e67c78d";
	
	// Parameter: ID of account that made purchases for user
	// Returns: URL for request to get all purchases by user
	public static URL makeURL(String account_id) {
		String prefix = "http://api.reimaginebanking.com/accounts/";
		String suffix = "/purchases?";
		String spec = prefix + account_id + suffix + key;
		String test = "http://api.reimaginebanking.com/accounts/56c66be7a73e492741508217/purchases?key=26919f14786c1d9c548f0e653e67c78d";
		//System.out.println(spec);
		//URL url = new URL(test);
		URI uri = new URI("http://www.google.com/");
		/*
		URL url = new URL("");
		try {
			url = new URL("http://www.google.com/");
			return url;
		} 
		catch (MalformedURLException ex) {
			return url;
		}
		*/
		return uri.toURL();
	}
	
	
	// Parameter: ID of account that made purchases for user
	// Returns: ArrayList of Purchase objects for all purchases made by user 
	public static String getHistory(String account_id) {
		
		// Create URL
		//url = URL();
		
		// Construct http request to send to Nessie Server
		
		//connection = HttpURLConnection(URL u);
		return "";
	}
	
	public static void main(String[] args) {
		String account_id = "56c66be7a73e492741508217";
		System.out.println(makeURL(account_id).toString());
	}
}
