package me.alexandroff.tests;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 0, 5, 1};

        for (int element : arr1) {
            System.out.println(element);
        }

        sort(arr1);

        System.out.println(Arrays.toString(arr1));
    }
}
