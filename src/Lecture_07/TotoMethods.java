package Lecture_07;

import java.util.Random;
import java.util.Scanner;

public class TotoMethods {

    public static int inputX(int x) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[x];
        for (int i = 0; i < input.length; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            input[i] = scanner.nextInt();
        }

        return input[x];
    }


    public static void main(String[] args) {

        while (true) {

            // Enter x integers from console
            Scanner scanner = new Scanner(System.in);

            System.out.print("Toto (x of y), enter x: ");
            int x = scanner.nextInt();
            System.out.print("Toto (x of y), enter y: ");
            int y = scanner.nextInt();
            int[] input = new int[inputX(x)];

            System.out.println();

            System.out.print("\nYour input is: ");
            // Prints input
            for (int i = 0; i < input.length; i++) {
                System.out.printf("%4d", input[x]);
            }

            Random random = new Random();
            int[] toto = new int[x];

            System.out.print("Toto (x of y):");

            // Calculates random numbers
            int i = 0;
            while (i < toto.length) {
                toto[i] = random.nextInt(y);

                // Checks the random numbers for duplicates and 0
                for (int j = (i - 1); j >= 0; j--) {

                    while (toto[i] == toto[j] || toto[i] == 0) {
                        toto[i] = random.nextInt(y);
                    }
                }
                System.out.printf("%4d", toto[i]);

                i++;
                if (i > (toto.length - 1)) {
                    break;
                }
            }

            // Checks the result
            int win = 0;
            for (i = 0; i < toto.length; i++) {
                for (int j = 0; j < toto.length; j++) {
                    if (toto[i] == inputX(j)) {
                        win++;
                    }
                }
            }

            System.out.println("\n \nYou win << " + win + " >> points"); // Prints the result

            // my.Check for another game
            System.out.print("\nDo you want another game (y/n): ");
            char again = scanner.next().charAt(0);
            System.out.println();
            if (again != 'y') {
                break;
            }
        }

    }
}
