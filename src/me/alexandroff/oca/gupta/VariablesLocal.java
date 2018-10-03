package me.alexandroff.oca.gupta;

public class VariablesLocal {

    public static void main(String... aaa) {

        int int1 = 1;

        if (int1 > 5) {
            int int2 = 20;
            System.out.println(int2);
        }
        //System.out.println(int2); int2 is out of scope

        //int a = b;
        // - "b" cannot be defined and initialized afterwards
        int b = 20;

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }

        //System.out.println(i);
        // - "i" is out of scope

    }
}
