package me.alexandroff.maxplus.account;

public class CreditAccount implements AccountSpecification {

    private double balance;

    @Override
    public boolean withdraw(double amount) {
        if (this.balance >= amount * 1.03) {
            this.balance = this.balance - amount * 1.03;

            return true;
        } else

        {
            return false;
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance + amount;

    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
