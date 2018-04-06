package account;

import java.util.Scanner;

public class BankTest2 {

    public static void main(String[] args) {

        Client alex = new Client("Alexander", 1000, 500);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Savings Account | Deposit or Withdraw? (d/w): ");
        String operationType = scanner.next();
        if (operationType.equals("d")) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            alex.depositSavings(amount);
            System.out.println("Your balance after deposit of " + amount
                    + " is " + alex.getBalanceSavings());
        }

        if (operationType.equals("w")) {
            System.out.print("Enter withdraw amount: ");
            double amount = scanner.nextDouble();
            alex.withdrawSavings(amount);
            System.out.println("Your balance after withdraw of " + amount
                    + " is " + alex.getBalanceSavings());
        }


    }
}
