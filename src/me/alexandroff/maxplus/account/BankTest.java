package me.alexandroff.maxplus.account;

public class BankTest {

    public static void main(String[] args) {
        Client boby = new Client("Boby", 1000,
                2000);
        Client mary = new Client("Mary", 400,
                200);

        System.out.println("Is withdraw of 500 successful? "
                + boby.withdrawCredit(500));
        System.out.println("Boby's credit balance: "
                + boby.getBalanceCredit());
        System.out.println();
        System.out.println("Deposit of 200 to Boby's credit me.alexandroff.maxplus.account.");
        boby.depositCredit(200);
        System.out.println("Boby's credit balance: "
                + boby.getBalanceCredit());
        System.out.println();
        System.out.println("Mary withdraws 100 from Savings Account");
        mary.withdrawSavings(100);
        System.out.println("Mary's savings balance is: " + mary.getBalanceSavings());
        System.out.println();
        System.out.println("Account type of Boby's credit me.alexandroff.maxplus.account: "
                + boby.getCreditAccount().getAccountType());
        System.out.println("Account type of Boby's savings me.alexandroff.maxplus.account: "
                + boby.getSavingsAccount().getAccountType());
    }
}
