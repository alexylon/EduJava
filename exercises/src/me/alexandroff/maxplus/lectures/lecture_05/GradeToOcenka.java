package me.alexandroff.maxplus.lectures.lecture_05;

import java.util.Scanner;

public class GradeToOcenka {

    public static void main(String[] args) {

        char grade;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input grade: ");
        grade = scanner.next().charAt(0);


        switch (grade) {
            case 'A':
                System.out.println("Grade A -> оценка 6");
                break;
            case 'B':
                System.out.println("Grade B -> оценка 5");
                break;
            case 'C':
                System.out.println("Grade C -> оценка 4");
                break;
            case 'D':
                System.out.println("Grade D -> оценка 3");
                break;
            case 'F':
                System.out.println("Grade F -> оценка 2");
                break;
            default:
                System.out.println("Invalid grade");

        }


    }
}
