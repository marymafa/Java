import CreditCard.CreditCard;
import PizzaOrder.PizzaOrder;
import Receipt.Receipt;

interface BillingService {
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
}