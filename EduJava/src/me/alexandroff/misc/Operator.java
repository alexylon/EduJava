package me.alexandroff.misc;

import java.util.Scanner;

public class Operator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int x=0;
        String op;

        System.out.print("Enter first integer: ");
        a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        b = scanner.nextInt();

        System.out.print("Choose an operator (+,-,*,/,%): ");
        op = scanner.next();

        System.out.println();

        if (op.equals("+")) {
            x = a + b;
        }
        if (op.equals("-")) {
            x = a - b;
        }
        if (op.equals("*")) {
            x = a * b;
        }
        if (op.equals("/")) {
            x = a / b;
        }
        if (op.equals("%")) {
            x = a % b;
        }

        System.out.println(a + op + b + "=" + x);


    }


}

