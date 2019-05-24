package com.TransactionLog.CreditCard.CreditCardProcessor;

import com.TransactionLog.CreditCard.ChargeResult;
import com.TransactionLog.CreditCard.CreditCard;
import com.TransactionLog.CreditCard.PaypalCreditCardProcessor.PaypalCreditCardProcessor;
import com.TransactionLog.CreditCard.PizzaOrder.PizzaOrder;

public interface CreditCardProcessor {
ChargeResult charge(CreditCard creditCard, boolean amout);
}
