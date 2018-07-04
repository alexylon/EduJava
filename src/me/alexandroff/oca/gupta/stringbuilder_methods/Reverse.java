package me.alexandroff.oca.gupta.stringbuilder_methods;

public class Reverse {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append("SAMSUNG").reverse();
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
    }
}
