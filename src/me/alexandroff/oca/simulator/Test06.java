package me.alexandroff.oca.simulator;

public class Test06 {
    public static void main(String[] args) {

        boolean b = true & false;
        boolean c = true || false;

        System.out.println(b + " " + c);

        Integer i1 = new Integer(1);
        int i2 = 1;
        byte b1 = 1;
        System.out.println(i1 == i2);
        System.out.println(i1 == b1);

        if (false) ;
        else ;
        //A valid statement, but notice the semicolons

        if (true) if (false) ;
        //A valid statement
    }
}
