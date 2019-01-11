package me.alexandroff.misc.accountex;

public class Test {

    public static void main(String[] args) {
        Client client1 = new Client("Tom", 1000.0);
        Account account1 = new Account(client1, client1.getMoney());

        System.out.println("Available 1000");
        System.out.println("Withdraw 4000");
        try {
            account1.withdraw(4000.0);
        } catch (AccountBalanceException e) {
            e.printStackTrace();
        }
        System.out.println("Remaining " + account1.getBalance());

    }
}
