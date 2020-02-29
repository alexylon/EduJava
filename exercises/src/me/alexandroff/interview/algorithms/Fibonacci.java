package me.alexandroff.interview.algorithms;

public class Fibonacci {
    public static void main(String[] args) {
        int[] fibоnacci = calculateFibonacci(10);
        for (int element : fibоnacci) {
            System.out.print(element + " ");
        }
    }

    static int[] calculateFibonacci(int n) {
        int[] fibonacci = new int[n];
        if (n == 0)
            return fibonacci;

        if (n == 1) {
            fibonacci[0] = 0;
            return fibonacci;
        }

        if (n == 2) {
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            return fibonacci;
        }

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        if (n > 2) {
            for (int i = 3; i < fibonacci.length; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }
}
