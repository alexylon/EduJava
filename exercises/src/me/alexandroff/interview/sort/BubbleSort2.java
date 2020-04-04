package me.alexandroff.interview.sort;

import java.util.Arrays;

public class BubbleSort2 {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {5, 3, 6, 4, 2, 1};

        bubbleSort(ints);

        System.out.println(Arrays.toString(ints));
    }
}
