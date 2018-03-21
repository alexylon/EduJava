package Lecture_05;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        char grade;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input grade: ");
        grade = scanner.next().charAt(0);


        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very well done!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                return;
        }

        System.out.println("Your grade is " + grade);
    }

}