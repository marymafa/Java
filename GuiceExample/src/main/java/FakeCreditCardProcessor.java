public class FakeCreditCardProcessor implements CreditCardProcessor {
    private CreditCard creditCard;

    public  FakeCreditCardProcessor(CreditCard creditCard){
        this.creditCard = creditCard;
    };

    public CreditCard getCardOfOnlyCharge() {
        return creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return 100;
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return new ChargeResult(true);
    }
}
