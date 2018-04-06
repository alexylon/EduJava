package model;

import java.util.Scanner;

public class Rectangle {

    private Double a;
    private Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getArea(double a, double b) {
        return a * b;
    }

    public Double getPerimeter() {
        return (a + b) * 2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        Double a = scanner.nextDouble();
        System.out.print("Input b: ");
        Double b = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(a, b);
        System.out.println("The area is: " + rectangle.getArea(a, b));
        System.out.println("The perimeter is: " + rectangle.getPerimeter());
    }

}
