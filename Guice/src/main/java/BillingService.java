import CreditCard.CreditCard;
import PizzaOrder.PizzaOrder;
import Receipt.Receipt;

public interface BillingService {
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
}