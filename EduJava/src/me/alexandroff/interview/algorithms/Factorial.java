package me.alexandroff.interview.algorithms;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(7));
    }

    static long calculateFactorial(int n) {
        if (n == 0)
            return 1;

        long f = 1;
        for (long i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
