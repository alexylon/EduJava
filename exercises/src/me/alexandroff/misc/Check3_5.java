package me.alexandroff.misc;

import java.util.Scanner;

public class Check3_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("The number is: " + number);
        if ((number % 3) == 0 && (number % 5) == 0) System.out.println("This number can be devided by 3 and 5");
        else System.out.println("This number CANNOT be devided by 3 and 5");


    }
}
