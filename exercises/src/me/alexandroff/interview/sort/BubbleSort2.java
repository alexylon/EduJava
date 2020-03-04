package me.alexandroff.interview.sort;

import java.util.Arrays;

public class BubbleSort2 {
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[j]
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
