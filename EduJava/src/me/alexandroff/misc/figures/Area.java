package me.alexandroff.misc.figures;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.print("Type 'r' for Rectangle or 'c' for Circle: ");
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();

        if (type.equals("r")) {
            System.out.print("\nRectangular width: ");
            double a = in.nextDouble();
            System.out.print("\nRectangular height: ");
            double b = in.nextDouble();
            Figure rectangle = new Rectangle(a, b);
            System.out.println("\nThe area of the rectangle is: " + rectangle.calcArea());
        }

        if (type.equals("c")) {
            System.out.print("\nCircle radius: ");
            double r = in.nextDouble();
            Figure circle = new Circle(r);
            System.out.println("\nThe area of the circle is: " + circle.calcArea());
        }
    }

}

