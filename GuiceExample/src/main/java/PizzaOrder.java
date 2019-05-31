public class PizzaOrder {
    int order;

    ChargeResult chargeResult = new ChargeResult( true );

    public PizzaOrder(int num){
        this.order = num;
    }

    public Receipt getAmount() {
        return new Receipt();
    }
}
