package my;

import java.util.*;

public class TotoSet {

    public static void main(String[] args) {

        // Input 6 numbers from the console
        System.out.println("Enter 6 different numbers (1-29)");
        Set<Integer> inputNumbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("Enter number #" + (++i) + ": ");
            int input = scanner.nextInt();
            inputNumbers.add(input);
        } while (inputNumbers.size() < 6);
        System.out.println(inputNumbers);

        // Calculates 6 random numbers
        Random random = new Random();
        Set<Integer> randomNumbers = new TreeSet<>();
        int r = 0;
        do {
            do {
                r = random.nextInt(30);
            } while (r == 0);

            randomNumbers.add(r);
        } while (randomNumbers.size() < 6);
        System.out.println(randomNumbers);
    }
}
