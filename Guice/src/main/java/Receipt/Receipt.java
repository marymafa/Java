package Receipt;

public class Receipt {
    public void writeHeader()
    {
        System.out.println ("Bambino's Pizza - Branch Manager Farid Hernande");
    }

    public void writeDetailsLine(String pizzaType, Double price, int pizzaNumStr){
        System.out.println ("pizza" + pizzaType + "number" + pizzaNumStr + "@" + price + "="
                + price * pizzaNumStr);

    };

    public void writeTotalLine() {
        System.out.println("Subtotalamount" + "tax" + "@" + "8%" + "Finalcost");
        }

}
