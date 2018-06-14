package me.alexandroff.maxplus.account;

public interface AccountSpecification {

    boolean withdraw(double amount);

    void deposit(double amount);

    double getBalance();

    default AccountType getAccountType() {
        return AccountType.CREDIT;
    }
}
