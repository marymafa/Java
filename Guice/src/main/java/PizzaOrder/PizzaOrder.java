package PizzaOrder;

public class PizzaOrder {
    public static final String PIZZA_SMALL = "S";
    public static final String PIZZA_MEDIUM = "M";
    public static final String PIZZA_LARGE = "L";
    public static final String PIZZA_COLLOSAL = "C";

    public static final double PRICE_SMALL = 8;
    public static final double PRICE_MEDIUM = 11;
    public static final double PRICE_LARGE = 15;
    public static final double PRICE_COLOSSAL = 21;
    public static final double PRICE_TAX;
    private static String pizzaName;

    static {
        PRICE_TAX = 0.095;
    }

    public static double getPizzaPRice( String pizzaName){
        PizzaOrder.pizzaName = pizzaName;
        if (pizzaName.equals(PIZZA_SMALL)) {
            System.out.println("pizza prize" + PRICE_SMALL);
            return PRICE_SMALL;
        } else if (pizzaName.equals(PIZZA_MEDIUM)) {
            System.out.println("pizza price" + PRICE_MEDIUM);
            return PRICE_MEDIUM;
        } else if (pizzaName.equals(PIZZA_LARGE)) {
            System.out.println("pizza price" + PRICE_LARGE);
            return PRICE_LARGE;
        } else {
            System.out.println("price_colossal" + PRICE_COLOSSAL);
            return PRICE_COLOSSAL;
        }
    }


};

