import java.net.*;
import java.io.*;

// Must throw exception for all Net functions because of exceptions caused by URL()
// Example for http request: http://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
// Need (?) to set property for "Accept: application/json"
// Assuming all http requests are of format: curl -X GET --header "Accept: application/json" <URL_String>
// Need to do something about Key (parameterize?)

public class Purchase {
	
	// Key used for querying Capitol One Nessie data base
	private static String key = "key=26919f14786c1d9c548f0e653e67c78d";
	
	// Parameters: String for Account's ID
	// Returns: URL to request all purchases made from the Account
	private static URL makeURL_Purchase_Account(String account_id) throws Exception {
		String prefix = "http://api.reimaginebanking.com";
		String account = "/accounts/" + account_id;
		String suffix = "/purchases?" + key;
		String spec = prefix + account + suffix;
		URL url = new URL(spec);
		return url;
	}
	
	// Parameters: String for Merchant's ID, String for Account's ID
	// Returns: URL to request all purchases made to the Merchant from the Account
	private static URL makeURL_Purchase_Merchant_Account(String merchant_id, String account_id) throws Exception {
		String prefix = "http://api.reimaginebanking.com";
		String merchant = "/merchants/" + merchant_id;
		String account = "/accounts/" + account_id;
		String suffix = "/purchases?" + key;
		String spec = prefix + merchant + account + suffix;
		URL url = new URL(spec);
		return url;
	}
	
	// Parameters: String for Merchant's ID
	// Returns: URL to request all purchases made to the Merchant
	private static URL makeURL_Purchase_Merchant(String merchant_id) throws Exception {
		String prefix = "http://api.reimaginebanking.com";
		String merchant = "/merchants/" + merchant_id;
		String suffix = "/purchases?" + key;
		String spec = prefix + merchant + suffix;
		URL url = new URL(spec);
		return url;
	}
	
	// Parameters: String for Account's ID, String for the new purchase
	// Returns: URL to create the new purchase for the Account
	private static URL makeURL_New_Purchase(String account_id, String purchase_json) throws Exception {
		
	}
	
	// Tester main method
	public static void main(String[] args) throws Exception {
		//String account_id_1 = "asdasdas";
		//String merchant_id_1 = "bad_id";
		
		String account_id_1 = "56c66be7a73e492741508217";
		String account_id_2 = "56c66be7a73e492741508219";
		String account_id_3 = "56c66be7a73e49274150821b";
		
		String merchant_id_1 = "56c66be6a73e49274150762e";
		String merchant_id_2 = "56c66be6a73e49274150762f";
		String merchant_id_3 = "56c66be6a73e492741507624";
		
		System.out.println(getPurchase_Account(account_id_1));
		System.out.println(getPurchase_Merchant_Account(merchant_id_2, account_id_1));
		System.out.println(getPurchase_Merchant(merchant_id_2));
	}
}
