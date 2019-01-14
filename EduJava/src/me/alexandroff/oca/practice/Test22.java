package me.alexandroff.oca.practice;

public class Test22 {
    public static void main(String args[]) {
        boolean b = false;
        int i = 1;
        do {
            i++;
        } while (b = !b);
        System.out.println(i);
    }
}
