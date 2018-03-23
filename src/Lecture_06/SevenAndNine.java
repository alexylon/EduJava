package Lecture_06;

import java.util.Scanner;

public class SevenAndNine {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 || i % 9 == 0) {
                System.out.println(i);
            }
            if (i % 7 == 0 && i % 9 == 0) {
                break;
            }
        }

    }
}