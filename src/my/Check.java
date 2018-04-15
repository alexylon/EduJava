package my;

import java.util.Scanner;

public class Check {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("The number is: " + number);
        if (number%2 == 0) System.out.println("This number is even");
        if (number%2 != 0) System.out.println("This number is odd");


    }
}
