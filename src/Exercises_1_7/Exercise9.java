package Exercises_1_7;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        int[] intArray = {2, 4, 6, 8, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int target = sc.nextInt();

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == target) {
                System.out.println("Found on index " + i);
                return;
            }

        }
        System.out.println("Not found. Sorry!");
    }
}
