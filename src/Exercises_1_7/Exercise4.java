package Exercises_1_7;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        int grade;

        Scanner scanner = new Scanner(System.in);
        do {
        System.out.print("Въведете оценка: ");
        grade = scanner.nextInt();
        } while (grade < 2 || grade > 6);


        switch (grade) {
            case 2:
                System.out.println("Слаб!");
                break;
            case 3:
                System.out.println("Среден!");
                break;
            case 4:
                System.out.println("Добър!");
                break;
            case 5:
                System.out.println("Много добър");
                break;
            case 6:
                System.out.println("Отличен");
                break;
            default:
                System.out.println("Невалидна оценка");

        }

    }
}
