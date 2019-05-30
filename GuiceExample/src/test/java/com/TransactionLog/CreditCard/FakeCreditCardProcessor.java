package com.TransactionLog.CreditCard;

public class FakeCreditCardProcessor {

  public  CreditCard creditCard;
  public int amount;

    public CreditCard getCardOfOnlyCharge() {
         return creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return amount;
    }
}
