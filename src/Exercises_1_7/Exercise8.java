package Exercises_1_7;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number (<=15): ");
            n = sc.nextInt();
        }
        while (n < 0 || n > 15);

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {

                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
