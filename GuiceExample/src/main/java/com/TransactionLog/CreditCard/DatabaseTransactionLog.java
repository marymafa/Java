package com.TransactionLog.CreditCard;

import com.TransactionLog.CreditCard.PizzaOrder.PizzaOrder;

public class DatabaseTransactionLog implements TransactionLog {

    @Override
    public PizzaOrder charge(PizzaOrder orderPizza) throws TransactionLog.UnreachableException, UnreachableException {
        return orderPizza;
    }

    @Override
    public void logConnectException(UnreachableException e) {

    }

    @Override
    public void logChargeResult(ChargeResult result) {

    }
}
