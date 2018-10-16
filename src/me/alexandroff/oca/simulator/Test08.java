package me.alexandroff.oca.simulator;

public class Test08 {
    public static void main(String[] args) {

        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long l1 = 1L;

        System.out.println(i1 == i2);//false
        System.out.println(i1 == i3);//true
        //System.out.println(i1 == b1); - Won't compile
        //System.out.println(i1 == l1); - Won't compile
        System.out.println(i1.equals(i2));//true
        System.out.println(i1.equals(l1));//false
        System.out.println(i1.equals(b1));//false
    }
}
