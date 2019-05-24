package com.TransactionLog.CreditCard.Receipt;

public class Receipt {
     boolean amount;
    boolean forSystemFailure;
    boolean message;



    public static boolean forSuccessfulCharge(boolean amount) {
        return  amount;
    }

    public static boolean forSystemFailure(boolean message) {
        return message;
    }

    public static String forDeclinedCharge(String declineMessage) {
        return  declineMessage;
    }


    public String Receipt(String PizzaOrder, Double price){
        System.out.println ("pizza" + PizzaOrder + "price"  + price );
        return PizzaOrder + price;
    };


}
