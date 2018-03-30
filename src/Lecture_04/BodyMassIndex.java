package Lecture_04;

import java.util.Scanner;

public class BodyMassIndex {


    public static double getBodyMassIndex(double weight, double height) {

        return weight / (Math.pow(height, 2));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input your weight (kg): ");
        if (scanner.hasNextDouble()) {
            break;
        }
            String word = scanner.next();
            System.err.println(word + " is not a number");
        }
        double weight1 = scanner.nextDouble();


        while (true) {
            System.out.print("Input your height (m): ");
        if (scanner.hasNextDouble()) {
            break;
        }
            String word = scanner.next();
            System.err.println(word + " is not a number");
        }
        double height1 = scanner.nextDouble();

        double BMI = getBodyMassIndex(weight1, height1);
        System.out.printf("\n" + "Your body mass index is: " + "%.2f", BMI);
        System.out.println();
        if (BMI <= 18.5) System.out.println("You are underweight");
        if (BMI > 18.5 && BMI < 25.0) System.out.println("You are OK");
        if (BMI >= 25.0) System.out.println("You are fat");
    }
}
