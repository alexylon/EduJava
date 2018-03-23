package Lecture_07;

import java.util.Scanner;
import java.util.Random;

public class Toto {

    public static void main(String[] args) {

        // Enter 6 integers from console
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[6];
        for (int i = 0; i < input.length; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            input[i] = scanner.nextInt();
        }

        System.out.print("Your input is: ");

        // Print input
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }

        System.out.println();

        Random random = new Random();
        int[] toto = new int[6];
        System.out.print("Result: ");

        // Calculate random numbers
        int i = 0;
        while (i < toto.length) {
            toto[i] = random.nextInt(49);

           //Check for duplicates and 0
            for (int j = (i - 1); j >= 0; j--) {

                while (toto[i] == toto[j] || toto[i] == 0) {
                    toto[i] = random.nextInt(49);
                }

            }
            System.out.print(toto[i] + " ");

            i++;
            if (i > (toto.length - 1)) {
                break;
            }
        }
        System.out.println();
    }
}