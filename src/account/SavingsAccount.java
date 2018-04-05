package account;

public class SavingsAccount implements AccountSpecification {

    double balance;
    private AccountType accountType = AccountType.SAVINGS;

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;

            return true;
        } else

        {
            return false;
        }
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount * 1.01;

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }
}
