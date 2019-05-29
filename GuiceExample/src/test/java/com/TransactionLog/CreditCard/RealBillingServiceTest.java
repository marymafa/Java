package com.TransactionLog.CreditCard;

import com.TransactionLog.CreditCard.PizzaOrder.PizzaOrder;
import com.TransactionLog.CreditCard.Receipt.Receipt;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class RealBillingServiceTest extends TestCase {

    private final PizzaOrder order = new PizzaOrder();
    private final CreditCard creditCard = new CreditCard();

    private final InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
    private final FakeCreditCardProcessor processor = new FakeCreditCardProcessor();

    public void testSuccessfulCharge() {
        RealBillingService billingService
                = new RealBillingService(processor, transactionLog);
        boolean receipt = billingService.chargeOrder(order, creditCard);

        assertTrue( receipt.hasSuccessfulCharge());
        assertEquals(100, receipt.if());
        assertEquals(creditCard, processor.getCardOfOnlyCharge());
        assertEquals(100, processor.getAmountOfOnlyCharge());
        assertTrue(transactionLog.wasSuccessLogged());
    }

}