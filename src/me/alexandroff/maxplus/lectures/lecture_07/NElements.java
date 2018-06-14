package me.alexandroff.maxplus.lectures.lecture_07;

import java.util.Scanner;

public class NElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == array[i + 1]) {
                System.out.print(array[i]);
            }
        }
    }

}
