public class FakeCreditCardProcessor implements CreditCardProcessor {
    private CreditCard creditCard;
    public CreditCard getCardOfOnlyCharge() {
        return creditCard;
    }

    public int getAmountOfOnlyCharge() {
        return 0;
    }

    @Override
    public ChargeResult charge(CreditCard creditCard, Object amount) {
        return new ChargeResult(true);
    }
}
