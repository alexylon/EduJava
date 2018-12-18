package me.alexandroff.oca.simulator;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arrInt = new int[3];
        for (int e : arrInt) {
            System.out.println(e);
        }

        String[] arrStr = new String[3];
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }

    }
}
