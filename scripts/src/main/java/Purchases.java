/**
 * Created by Jackey on 4/2/2016.
 */

import com.google.gson.Gson;

public class Purchases {

    String idPurchase, idMerchant, medium, purchaseDate, status, description, type, idPayer;

    int amount;

    public Purchases(String idPurchase, String idMerchant, String medium, String purchaseDate,
                     int amount, String status, String description, String type, String idPayer) {
        super();
        this.idPurchase = idPurchase;
        this.idMerchant = idMerchant;
        this.purchaseDate = purchaseDate;
        this.amount = amount;
        this.status = status;
        this.description = description;
        this.type = type;
        this.idPayer = idPayer;
    }

    @Override
    public String toString() {
        return "ModelObject [ \n _id=" + idPurchase + ", \nmerchant_id=" + idMerchant + ", \nmedium=" + medium +
                ", \npurchase_date=" + purchaseDate + ", \namount=" + amount + ", \nstatus=" + status +
                ", \ndescription=" + description + ", \ntype=" + type + ", \nidPayer=" + idPayer + "\n]";
    }

    public static void main(String[] args) {
        final Gson gson = new Gson();

        String json = args[0];

        System.out.println("fromJson----");
        // getting object from json representation
        System.out.println("Original JSON string is : " + json);
        // converting json to object
        Purchases modelPurchase1 = gson.fromJson(json, Purchases.class);
        System.out.println("Converted Java object : " + modelPurchase1);
    }

}

