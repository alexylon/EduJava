package Exercises_1_7;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Alexander");
        }

        System.out.println();
        int j = 1;
        while (j <= n) {
            System.out.println("Alexander");
            j++;
        }
    }
}
