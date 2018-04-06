import java.util.Random;
import java.util.Scanner;

public class Toto {

    public static void main(String[] args) {

        while (true) {

            // Enter 6 integers from console
            Scanner scanner = new Scanner(System.in);
            int[] input = new int[6];

            for (int i = 0; i < input.length; i++) {

                do {
                    System.out.print("Enter number #" + (i + 1) + ": ");
                    input[i] = scanner.nextInt();

                } while (input[i] <= 0 || input[i] > 29);
            }
            System.out.print("\nYour input is: ");

            // Prints input
            for (int i = 0; i < input.length; i++) {
                System.out.printf("%4d", input[i]);
            }

            System.out.println();

            Random random = new Random();
            int[] toto = new int[6];

            System.out.print("Toto (6 of 29):");

            // Calculates random numbers
            int i = 0;
            while (i < toto.length) {
                toto[i] = random.nextInt(29);

                // Checks the random numbers for duplicates and 0
                for (int j = (i - 1); j >= 0; j--) {

                    while (toto[i] == toto[j] || toto[i] == 0) {
                        toto[i] = random.nextInt(29);
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
                    if (toto[i] == input[j]) {
                        win++;
                    }
                }
            }

            System.out.println("\n \nYou win << " + win + " >> points"); // Prints the result

            if (win == 0) {
                System.out.println(":-(");
            }
            if (win == 1) {
                System.out.println(":-|");
            }
            if (win == 2) {
                System.out.println(":-)");
            }
            if (win == 3) {
                System.out.println(":-))");
            }
            if (win == 4) {
                System.out.println(":-)))");
            }
            if (win == 5) {
                System.out.println(":-))))");
            }
            if (win == 6) {
                System.out.println("******** :-)))))) ********");
            }

            // my.Check for another game
            System.out.print("\nDo you want another game ('n' for no): ");
            char again = scanner.next().charAt(0);
            System.out.println();
            if (again == 'n') {
                break;
            }
        }
    }
}
