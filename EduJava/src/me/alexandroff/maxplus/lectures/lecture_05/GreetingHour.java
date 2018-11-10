package me.alexandroff.maxplus.lectures.lecture_05;

import java.util.Scanner;

public class GreetingHour {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input hour (0-24): ");


            if (scanner.hasNextInt()) {
                int hour = scanner.nextInt();
                if (hour <= 24) {

                    if (hour > 1 && hour <= 10) {
                        System.out.println("Добро утро!");
                    } else if (hour > 10 && hour <= 18) {
                        System.out.println("Добър ден!");
                    } else if (hour > 18 && hour <= 24) {
                        System.out.println("Добър вечер!");
                    }

                    break;
                }
            } else {
                    System.out.println("Invalid");
                    scanner.next();
            }




                //String word = scanner.next();
                //sSystem.out.println();



            }


    }
}