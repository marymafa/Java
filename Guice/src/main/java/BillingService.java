import CreditCard.CreditCard;
import PizzaOrder.PizzaOrder;
import Receipt.Receipt;

class BillingService {

    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    BillingService(CreditCardProcessor processor,
                   TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {

    }
}