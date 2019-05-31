public class PizzaOrder {
    int order;
    public PizzaOrder(int num){
        this.order = num;
    }
    public Receipt getAmount() {
        return new Receipt();
    }
}
