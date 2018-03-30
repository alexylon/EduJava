package Exercises_1_7;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        double contr1;
        double contr2;
        double test;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Оценка контролно 1: ");
            contr1 = sc.nextDouble();
        } while (contr1 < 2.0 || contr1 > 6.0);

        do {
            System.out.print("Оценка контролно 2: ");
            contr2 = sc.nextDouble();
        } while (contr2 < 2.0 || contr2 > 6.0);

        do {
            System.out.print("Оценка тест: ");
            test = sc.nextDouble();
        } while (test < 2.0 || test > 6.0);

        double average = (contr1 + contr2 + test) / 3;
        System.out.print("Средната оценка е: ");
        System.out.printf("%.2f", average);
    }
}

