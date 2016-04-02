package lib;

import java.lang.StringBuilder;

import com.google.gson.Gson;

public class PurchasesList {
	
	public static boolean upload(Purchases purchase) {
		
		boolean success = false;
		
		//NOT WORKINGGGGGG
		
		return success;
	}
	
	public static Purchases create(String json) {
		final Gson gson = new Gson();
		Purchases newPurchase = gson.fromJson(json, Purchases.class);
		return newPurchase;
	}
	
	public static int parse(String list) {
		
		int nodes = 0;
		int bracket1, bracket2;
		boolean success;
		String subList;
		
		StringBuilder fullList = new StringBuilder(list);
		
		while (fullList.indexOf("{") >= 0) {
		
			bracket1 = fullList.indexOf("{");
			bracket2 = fullList.indexOf("}");
		
			subList = fullList.substring(bracket1, bracket2+1);
			System.out.println("Sublist:\n"+subList);
			Purchases node = create(subList);

		    //  System.out.println("Converted Java object : " + node);
			//if (success) nodes++;
			
			fullList = fullList.delete(0, bracket2+1);
		}
		
		return nodes;	
	}
	
	public static void main(String[] args) {
			int n = parse(args[0]);
				
			System.out.println(n);
	   }
	 

}
