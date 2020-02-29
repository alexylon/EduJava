package me.alexandroff.maxplus.lectures.lecture_04;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int smallest = scanner.nextInt();


        while (true) {

            System.out.print("Input next integer (if not integer = result): ");
            int nextVar = scanner.nextInt();

            if (smallest > nextVar) {
                smallest = nextVar;
            }

            if (!scanner.hasNextInt()) {
                break;
            }

        }

        System.out.println("\n" + "The smallest integer is: " + smallest);


    }
}
