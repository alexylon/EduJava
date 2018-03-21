package lecture_04;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        double random = Math.random() * 10;
        random = (int) random;
        int c = 0;
        int x;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input (max 3 times) an integer from 0 to 10: ");
            x = scanner.nextInt();
            if (x == (int) random) {
                System.out.println("You guessed the integer");
            }
            if (x < (int) random) {
                System.out.println("Your integer is smaller");
            }
            if (x > (int) random) {
                System.out.println("Your integer is bigger");
            }

            c++;

        } while ((x != random) && (c < 3));

        System.out.println("The right integer is: " + (int) random);


    }
}
