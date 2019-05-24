package com.TransactionLog.CreditCard;

public class ChargeResult {
    private boolean successful;

  public boolean  wasSuccessful(){
      return successful;
  }

  public  boolean forSuccessfulCharge(boolean successful){
      return  successful;
  };
    public String forDeclinedCharge(){
        return "";
    }
public String  getDeclineMessage(){
        return "";
}
}
