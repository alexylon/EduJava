package me.alexandroff.oca;

public class LocalVariablesTest {
    int zero = 0;
    int one = 1;
    int two = 2;
    final int FIVE = 5;

    void calc() {
        int one, two;
        if (zero < 10) {
            one = 1;
            two = 2;
        }
        //System.out.println(one + two); - DOES NOT COMPILE
        // 'one' and 'two' cannot be initialized,
        // because 'zero' is not known at compile time
    }

    void calc2() {
        int one, two;
        if (FIVE < 10) {
            one = 1;
            two = 2;
        }
        System.out.println(one + two);
        // OK as 'FIVE' is 'final' and is known at compile time
    }

    public static void main(String[] args) {
        new LocalVariablesTest().calc();
        new LocalVariablesTest().calc2();
    }
}
