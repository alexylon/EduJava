package me.alexandroff.misc;

import java.util.Scanner;
import java.util.Random;


public class Scores {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int numValues = scanner.nextInt();
        int[] array = randomArray(numValues);

        System.out.print("{" + array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("}");

        System.out.print("{");
        for (int value : array) {
            System.out.print(value + "  ");
        }
        System.out.println("}");
    }
}
