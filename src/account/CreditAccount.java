package account;

public class CreditAccount implements AccountSpecification {

    double balance;

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount * 1.03) {
            balance = balance - amount * 1.03;

            return true;
        } else

        {
            return false;
        }
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;

    }

    @Override
    public double getBalance() {
        return balance;
    }
}
