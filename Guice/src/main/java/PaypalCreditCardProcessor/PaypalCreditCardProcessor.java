package PaypalCreditCardProcessor;

import CreditCard.CreditCard;
import CreditCardProcessor.CreditCardProcessor;

public class PaypalCreditCardProcessor extends CreditCardProcessor {

    public PaypalCreditCardProcessor(String cust, String bk, String acnt, int lim, double bal) {
        super();
    }

    public CreditCard  charge(CreditCard creditCard, int amount)
            throws UnreachableException {

        return new CreditCard(true, "PayPal");
    }


    private class UnreachableException extends Exception {
        public UnreachableException(String error) {
            super(error);
        }

        public UnreachableException(Exception e) {
            super(e);
        }
    }
}
