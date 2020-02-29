package me.alexandroff.oca.gupta.exception_handling;

public class ArithmeticExceptionClass {
    public static void main(String[] args) {
        System.out.println(9.0 / 0.0); // "Infinity"
        System.out.println(-9.0 / 0); // "-Infinity"
        System.out.println(9 / 0.0); // "Infinity"
        System.out.println((-9 / 0.0)); // "-Infinity"
        System.out.println(0.0 / 0.0); // "NaN" (Not a number)
        System.out.println(0.0 / 0); // "NaN"
        System.out.println(0 / 0.0); // "NaN"
        System.out.println(9 / 0); // ArithmeticException
        System.out.println(0 / 0); // ArithmeticException
    }
}
