package me.alexandroff.misc;

import java.util.Scanner;

public class RecursiveTest {

    public static int recursiveTest(int n) {

        if (n <= 0) {
            return 3;
        }
        System.out.println("n1 = " + n);

        int recurse = recursiveTest(n - 2);

        System.out.println("\n" + "n2 = " + n);
        System.out.println("recurse = " + recurse);

        int result = n * recurse;
        System.out.println("result = " + result);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 'n': ");
        int n = scanner.nextInt();
        System.out.println("\n" + "\n" + "The result of " + n + " is " + recursiveTest(n));
    }
}
