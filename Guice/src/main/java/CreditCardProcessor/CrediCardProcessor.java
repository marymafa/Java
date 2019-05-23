package CreditCardProcessor;

import CreditCard.CreditCard;
import PaypalCreditCardProcessor.PaypalCreditCardProcessor;


public interface CrediCardProcessor {
     CreditCard charge(CreditCard creditCard, int amount) throws PaypalCreditCardProcessor.UnreachableException;

  public  void wait(Class<PaypalCreditCardProcessor> paypalCreditCardProcessorClass);
}

