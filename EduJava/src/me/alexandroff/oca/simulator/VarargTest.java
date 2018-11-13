package me.alexandroff.oca.simulator;

public class VarargTest {
    public static void main(String[] args) {
        System.out.println(method1(1, 3)); // 1
        System.out.println(method1(1)); // 0. vararg may be omitted
        System.out.println(method1(1, 3, 4)); // 2
        System.out.println(method2(1, 3, 4)); // 4
        System.out.println(method1(1, new int[]{4, 5, 6})); // 3
        // There can be only ONE vararg in the parameter's call and it must be LAST
        method1(1, null); // Throws NullPointerException

    }

    static int method1(int a, int... varArg) {
        return varArg.length;
    }

    static int method2(int a, int... varArg) {
        return varArg[1];
    }
}
