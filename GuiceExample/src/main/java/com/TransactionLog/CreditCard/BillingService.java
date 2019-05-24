package com.TransactionLog.CreditCard;

import com.TransactionLog.CreditCard.CreditCard;
import com.TransactionLog.CreditCard.PizzaOrder.PizzaOrder;
import com.TransactionLog.CreditCard.Receipt.Receipt;

public interface BillingService {
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

}
