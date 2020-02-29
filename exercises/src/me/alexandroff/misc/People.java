package me.alexandroff.misc;

import java.util.Scanner;

public class People {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = new String[5];
        int i = 0;

        do {
            System.out.print("Enter name #" + (i + 1)
                    + " (total 5): ");
            people[i] = scanner.nextLine();
            i++;

        } while (i < 5);

        for (String value : people) {
            System.out.println(value);
        }
    }
}
