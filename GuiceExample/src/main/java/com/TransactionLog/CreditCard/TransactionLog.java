package com.TransactionLog.CreditCard;

import com.TransactionLog.CreditCard.PizzaOrder.PizzaOrder;

public interface TransactionLog {
    PizzaOrder charge(PizzaOrder orderPizza) throws TransactionLog.UnreachableException, DatabaseTransactionLog.UnreachableException;

    public void  logConnectException(UnreachableException e);

    public void logChargeResult(ChargeResult result);

    class UnreachableException extends Exception {
        public UnreachableException(String errorMessage) {
            super(errorMessage);
        }

    }

}

