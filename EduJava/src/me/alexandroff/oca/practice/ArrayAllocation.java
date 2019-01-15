package me.alexandroff.oca.practice;

public class ArrayAllocation {
    public static void main(String[] args) {
        int[] intArr = new int[3];
        String[] strArr = new String[3];
        boolean[] boolArr = new boolean[3];

        for (int integ : intArr) {
            System.out.println(integ);
        }

        for (String str : strArr) {
            System.out.println(str);
        }

        for (boolean bool : boolArr) {
            System.out.println(bool);
        }

        //The default values of array elements are very straightforward
        // - references are initialized to null, numeric primitives to 0,
        // and booleans to false.

    }
}
