package me.alexandroff.maxplus.shape;

import java.text.DecimalFormat;

public class Rectangle implements Shape, Comparable<Shape> {

    private double a;
    private double b;


    enum ShapeType {Circle, Rectangle}

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {

        return a * b;
    }

    @Override
    public double getPerimeter() {

        return 2 * (a + b);
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getPerimeter(),
                o.getPerimeter());
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Rectangle perimeter: "
                + df.format(this.getPerimeter());
    }
}
