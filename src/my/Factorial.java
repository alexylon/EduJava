package my;

import java.util.Scanner;

public class Factorial {


    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        System.out.println("n1 = " + n);

        int recurse = factorial(n - 1);

        System.out.println("\n" + "n2 = " + n);
        System.out.println("recurse = " + recurse);

        int result = n * recurse;

        System.out.println("result = " + result);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 'n' to calculate its factorial: ");
        int n = scanner.nextInt();
        System.out.println("\n" + "\n" + "The factorial of " + n + " is " + factorial(n));
    }
}
