// !!!

package me.alexandroff.oca.simulator;

public class InitializerTest {
    int a;
    final int B;
    // final int C; DOES NOT COMPILE AS 'C' must be initialized
    static int aStat;
    static final int B_STAT;
    // static final int C_STAT; DOES NOT COMPILE AS 'C_STAT' must be initialized

    InitializerTest() {
        System.out.println("From constructor");
    }

    {
        B = 5;

        System.out.println("From instance initializer");
    }

    static {
        B_STAT = 5;
        // a = 5;
        // Non-static field cannot be initialized by a static content

        System.out.println("From static initializer");
    }
}

class InitializerTester {
    public static void main(String[] args) {
        new InitializerTest();
        // This runs in the following order:
        // 1. static initializers
        // 2. instance initializers
        // 3. Constructor
    }
}
