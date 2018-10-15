package me.alexandroff.oca.simulator;

public class Test05 {

    public static void main(String[] args) {
        Integer i = new Integer(1);
        Long m = new Long(1);
        Boolean b = false;
        if (i.equals(b)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}
