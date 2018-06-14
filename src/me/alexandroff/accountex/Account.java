package me.alexandroff.accountex;

public class Account {

    private double balance;
    private Client client;

    public Account (Client client, double balance) {
        this.client = client;
        this.balance = balance;
    }

    public void withdraw(double amount) throws AccountBalanceException {
        if (balance >= amount) {
            balance = balance - amount;

        } else

        {
            throw new AccountBalanceException("Not enough money");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
