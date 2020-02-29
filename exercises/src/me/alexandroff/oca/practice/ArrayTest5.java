package me.alexandroff.oca.practice;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 1, 2};
        Object obj = intArray; //OK

        Object[] oa = new int[2][3]; // this is valid.
        //Of course, each element of the array created using
        // new int[2][3] is an array of ints.
        // An array of ints is an Object and therefore,
        // an array of array of ints is an array of Objects.
        /*
        Object[][] oaa = new int[ 2][ 3]; // this will not compile.
        */
    }
}
