package me.alexandroff.oca.simulator.b;

/*
public class AccessTest {
    int a;
    private int b;

    protected void c() {
    }

    public int d() {
        return 0;
    }
}
 */

import me.alexandroff.oca.simulator.a.AccessTest;

// What can be accessed by 'ref'?
public class AccessTester extends AccessTest {
    public static void main(String[] args) {
        AccessTest ref1 = new AccessTest();
        AccessTest ref2 = new AccessTester();
        AccessTester ref3 = new AccessTester();

        /*
        ref1.a; - NO
        ref1.b; - NO
        ref1.c(); - NO as ref1 is not of the type of the derived class
        ref2.c(); - -||-
        */
        ref1.d();
        ref2.d();
        ref3.c(); //!!!
        ref3.d();
    }
}
