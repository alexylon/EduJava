package me.alexandroff.maxplus.lectures.lecture_06;

import java.util.Scanner;

public class Factorial {


        public static int factorial(int n) {

            if (n == 0) {
                return 1;
            }

            int recurse = factorial(n - 1);

            int result = n * recurse;

            return result;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input 'n' to calculate its factorial: ");
            int n = scanner.nextInt();
            System.out.println("\n" + "\n" + "The factorial of " + n + " is " + factorial(n));
        }
    }

