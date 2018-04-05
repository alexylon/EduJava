package account;

public class Client {

    private String name;
    private AccountSpecification savingsAccount;
    private AccountSpecification creditAccount;

    public Client(String name, double savingMoney,
                  double creditMoney) {
        this.name = name;
        this.savingsAccount = new SavingsAccount();
        this.creditAccount = new CreditAccount();

        savingsAccount.deposit(savingMoney);
        creditAccount.deposit(creditMoney);
    }

    public double getBalanceCredit() {
        return this.creditAccount.getBalance();
    }

    public boolean withdrawCredit(double amount) {
        return this.creditAccount.withdraw(amount);
    }

    public double getBalanceSavings() {
        return this.savingsAccount.getBalance();
    }

    public void depositCredit(double amount) {
        this.creditAccount.withdraw(amount);
    }

    public boolean withdrawSavings(double amount) {
        return this.savingsAccount.withdraw(amount);
    }

    public void depositSavings(double amount) {
        this.savingsAccount.deposit(amount);
    }


    public boolean transfer(AccountSpecification from,
                            AccountSpecification to,
                            double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountSpecification getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(AccountSpecification savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public AccountSpecification getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(AccountSpecification creditAccount) {
        this.creditAccount = creditAccount;
    }
}
