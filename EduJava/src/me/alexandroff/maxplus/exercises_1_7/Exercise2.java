package me.alexandroff.maxplus.exercises_1_7;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();

        System.out.print("Input b: ");
        int b = scanner.nextInt();

        System.out.print("Input c: ");
        int c = scanner.nextInt();

        System.out.print("Обиколката на триъгълника е: ");
        int perim = a + b + c;
        System.out.println(perim);

        if (a == b && b == c) {
            System.out.println("Триъгълникът е равностранен!");
        } else if (a == b || b == c) {
            System.out.println("Триъгълникът е равнобедрен!");
        } else System.out.println("Триъгълникът е разностранен!");


    }
}
