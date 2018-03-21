package Lecture_05;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        double number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        number = scanner.nextDouble();

        if (number > 0.0) {
            System.out.println("Number " + number + " is positive");
        } else if (number == 0.0) {
            System.out.println("Number " + number + " is zero");
        } else if (number < 0.0) {
            System.out.println("Number " + number + " is negative");
        }


    }
}
