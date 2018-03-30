package Exercises_1_7;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        String myName = "Alexander";
        if (name.equals(myName)) {
            System.out.println("Same name with me!");
        } else {
            System.out.println("Our names are different!");
        }
    }
}
