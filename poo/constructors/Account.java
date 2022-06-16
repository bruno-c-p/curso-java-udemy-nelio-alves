package poo.constructors;

import java.text.DecimalFormat;

public class Account {

    DecimalFormat df = new DecimalFormat(".00");
    private int number;
    private String holder;
    private double balance;

    @Override
    public String toString() {
        return "Account: " + number +
                "\nHolder: " + holder +
                "\nBalance: $ " + df.format(balance);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount + 5.0;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
}
