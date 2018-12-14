package me.alexandroff.oca.simulator;

public class Test16 {

    static String s1 = sM1("a");

    {
        s1 = sM1("b");
    }

    static {
        s1 = sM1("c");
    }

    public static void main(String args[]) {
        Test16 it = new Test16();


    }


    private static String sM1(String s) {
        System.out.println(s);
        return s;
    }

}
