import CreditCardProcessor.CreditCardProcessor;

public class CreditCardProcessorFactory {
    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor creditCardProcessor) {
        instance = creditCardProcessor;
    }

    public static SquareCreditCardProcessor getInstance() {
        if (instance == null) {
            return new SquareCreditCardProcessor();
        }
        return (SquareCreditCardProcessor) instance;
    }

    private static class SquareCreditCardProcessor extends CreditCardProcessor {
        public SquareCreditCardProcessor(String cust, String bk, String acnt, int lim, double bal) {
            super();
        }

        public SquareCreditCardProcessor() {
            super();
        }
    }
}
