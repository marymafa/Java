package com.TransactionLog.CreditCard;

public class FakeCreditCardProcessor {

  private  CreditCard creditCard;
  private int amount;

    public CreditCard getCardOfOnlyCharge() {
         return creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return amount;
    }
}
