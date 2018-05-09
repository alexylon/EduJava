package my;

import java.util.*;

// Another variant of the game '6 of 29'
public class TotoSet {

    public static void main(String[] args) {

        while (true) {

            // Input 6 numbers from the console
            System.out.println("Enter 6 different numbers (1-29)");
            Set<Integer> inputNumbers = new TreeSet<>();
            Scanner scanner = new Scanner(System.in);
            int i = 0;
            do {
                int inputNumber;
                do {
                    System.out.print("Enter number: ");
                    inputNumber = scanner.nextInt();
                } while (inputNumber <= 0 || inputNumber > 29);
                inputNumbers.add(inputNumber);
            } while (inputNumbers.size() < 6);
            System.out.println("Your numbers: " + inputNumbers);

            // Calculates 6 random numbers
            Random random = new Random();
            Set<Integer> randomNumbers = new TreeSet<>();
            int randomNumber = 0;
            do {
                do {
                    randomNumber = random.nextInt(30);
                } while (randomNumber == 0);

                randomNumbers.add(randomNumber);
            } while (randomNumbers.size() < 6);
            System.out.println("Random numbers: " + randomNumbers);

            // Checks the result
            int win = 0;
            for (int inNumber : inputNumbers) {
                for (int ranNumber : randomNumbers) {
                    if (inNumber == ranNumber) {
                        win++;
                    }
                }
            }
            System.out.print("Your result is: " + win + "  ");

            String smile;
            switch (win) {
                case 1:
                    smile = ":-|";
                    break;
                case 2:
                    smile = ":-)";
                    break;
                case 3:
                    smile = ":-))";
                    break;
                case 4:
                    smile = ":-)))";
                    break;
                case 5:
                    smile = ":-D";
                    break;
                case 6:
                    smile = "******** :-D ********";
                    break;
                default:
                    smile = ":-(";
                    break;
            }

            System.out.println(smile);

            // Check for another game
            System.out.print("\nDo you want another game ('n' for no): ");
            char again = scanner.next().charAt(0);
            System.out.println();
            if (again == 'n') {
                break;
            }

        }
    }
}
