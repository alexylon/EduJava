package Lecture_05;

import java.util.Scanner;

public class DayNumber {

    public static void main(String[] args) {

        int numberDay;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Въведете номер на ден: ");
            if (scanner.hasNextInt()) {
                break;
            }
            String word = scanner.next();
            System.err.println(word + " не е номер");
            System.out.println();
        }
        numberDay = scanner.nextInt();


        switch (numberDay) {
            case 1:
                System.out.println("понеделник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("сряда");
                break;
            case 4:
                System.out.println("четвъртък");
                break;
            case 5:
                System.out.println("петък");
                break;
            case 6:
                System.out.println("събота");
                break;
            case 7:
                System.out.println("неделя");
                break;
            default:
                System.err.println("Невалидно число");

        }

    }
}
