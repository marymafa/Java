import CreditCard.CreditCard;
import CreditCardProcessor.CreditCardProcessor;
import PaypalCreditCardProcessor.PaypalCreditCardProcessor;
import PizzaOrder.PizzaOrder;
import Receipt.Receipt;
import TransactionLog.TransactionLog;
import TransactionLogFactory.TransactionLogFactory;

public class RealBillingService<ChargeResult> implements BillingService {

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        CreditCardProcessor processor = CreditCardProcessorFactory.getInstance();
        TransactionLog transactionLog = TransactionLogFactory.getInstance();

        try {
            boolean result = processor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (PaypalCreditCardProcessor.PaypalCreditCardProcessor.UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }
}
