package me.alexandroff.oca.simulator;

import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        int[] intArray = {3, 2, 1};
        System.out.println(Arrays.binarySearch(intArray, 3));
        System.out.println(Arrays.binarySearch(intArray, 2));
        System.out.println(Arrays.binarySearch(intArray, 1));

        System.out.println();

        Arrays.sort(intArray);
        System.out.println(Arrays.binarySearch(intArray, 3));
        System.out.println(Arrays.binarySearch(intArray, 2));
        System.out.println(Arrays.binarySearch(intArray, 1));
    }
}
