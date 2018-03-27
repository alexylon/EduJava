package Exercises_1_7;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= n; i += 3) {
            System.out.print(i + ", ");
        }

        System.out.println();
        int i = n;
        while (i >= 1) {
            System.out.print(i + ", ");
            if (i % 81 == 0) {
                break;
            }
            i -= 4;
        }
        System.out.println();

        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}