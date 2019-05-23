import CreditCard.CreditCard;
import PaypalCreditCardProcessor.PaypalCreditCardProcessor;
import PizzaOrder.PizzaOrder;
import Receipt.Receipt;

public interface BillingService {
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

  public  void wait(Class<RealBillingService> realBillingServiceClass);
}