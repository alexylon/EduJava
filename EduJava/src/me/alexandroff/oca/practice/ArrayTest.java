package me.alexandroff.oca.practice;

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

        int[] arr = new int[3];
        int a = arr[0];
        System.out.println(a);
    }
}
