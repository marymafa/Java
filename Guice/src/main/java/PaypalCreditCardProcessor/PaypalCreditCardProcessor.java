package PaypalCreditCardProcessor;

import CreditCard.CreditCard;
import CreditCardProcessor.CrediCardProcessor;


public class PaypalCreditCardProcessor implements CrediCardProcessor {

    public CreditCard  charge(CreditCard creditCard, int amount)
            throws UnreachableException {

        return new CreditCard(true, "PayPal");
    }

    public void wait(Class<PaypalCreditCardProcessor> paypalCreditCardProcessorClass) {
    }


    public class UnreachableException extends Exception {
        public UnreachableException(String error) {
            super(error);
        }

        public UnreachableException(Exception e) {
            super(e);
        }
    }
}
