package CreditCardProcessor;

import CreditCard.CreditCard;

public class CreditCardProcessor {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCardProcessor() {
        customer = customer;
        bank = bank;
        account = account;
        limit = limit;
        balance = balance;
    }

    // accessors
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
    public boolean charge(CreditCard creditCard, double price) {
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
