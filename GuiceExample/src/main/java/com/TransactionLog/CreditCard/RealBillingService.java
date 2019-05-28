package com.TransactionLog.CreditCard;

import com.TransactionLog.CreditCard.CreditCardProcessor.CreditCardProcessor;
import com.TransactionLog.CreditCard.PaypalCreditCardProcessor.PaypalCreditCardProcessor;
import com.TransactionLog.CreditCard.PizzaOrder.PizzaOrder;
import com.TransactionLog.CreditCard.Receipt.Receipt;

public class RealBillingService {
    public RealBillingService(com.TransactionLog.CreditCard.FakeCreditCardProcessor processor, com.TransactionLog.CreditCard.InMemoryTransactionLog transactionLog) {

    }

    public boolean chargeOrder(PizzaOrder order, CreditCard creditCard) {
        CreditCardProcessor processor = new PaypalCreditCardProcessor() {
            @Override
            public ChargeResult charge(CreditCard creditCard, boolean amount) {
                return null;
            }
        };
        TransactionLog transactionLog = new DatabaseTransactionLog();

        ChargeResult result = processor.charge(creditCard, order.getAmount());
        transactionLog.logChargeResult(result);

        return result.wasSuccessful()
                ? Receipt.forSuccessfulCharge(order.getAmount())
                : Boolean.parseBoolean(Receipt.forDeclinedCharge(result.getDeclineMessage()));
    }
}
