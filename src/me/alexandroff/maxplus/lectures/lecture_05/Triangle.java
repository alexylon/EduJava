package me.alexandroff.maxplus.lectures.lecture_05;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = scanner.nextInt();

        System.out.print("Input b: ");
        int b = scanner.nextInt();

        System.out.print("Input c: ");
        int c = scanner.nextInt();

        if (a==b && b==c) {
            System.out.println("Триъгълникът е равностранен");
        } else if (a==b || b==c) {
            System.out.println("Триъгълникът е равнобедрен");
        } else System.out.println("Триъгълникът е разностранен");



    }
}
