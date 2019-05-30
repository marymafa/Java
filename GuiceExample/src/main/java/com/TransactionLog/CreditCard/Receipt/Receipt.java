package com.TransactionLog.CreditCard.Receipt;

public class Receipt {

static  String amount;
static boolean hasSuccessfulCharge;
    boolean forSystemFailure;
    boolean message;


    public  static boolean hasSuccessfulCharge(){ return hasSuccessfulCharge;};

    public static  String getAmountOfCharge(){
        return amount;
    }

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
