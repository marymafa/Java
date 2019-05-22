package CreditCard;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // constructors - account for all cases, one with a bal, and one without
    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        customer = customer;
        bank = bank;
        account = account;
        limit = limit;
        balance = balance;
    }

    public CreditCard(String customer, String bank, String accout, int limit) {
        this(customer, bank, accout, limit, -0.0);
    }

    public CreditCard(boolean b, String payPal) {
        this.customer = payPal;
    }

    // accessors
    public String getCustomer() {
        System.out.println("customer" + customer);
        return customer;
    }

    public String getBank() {
        System.out.println("bank" + bank);
        return bank;
    }

    public String getAccount() {
        System.out.println("account" + account);
        return account;
    }

    public double getLimit() {
        System.out.println("limit" + limit);
        return limit;
    }

    public double getBalance() {
        System.out.println("balancee" + balance);
        return balance;
    }

    // updaters
    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        } else {
            balance += price;
        }
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

}
