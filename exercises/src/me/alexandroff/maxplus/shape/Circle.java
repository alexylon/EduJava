package me.alexandroff.maxplus.shape;

import java.text.DecimalFormat;

public class Circle implements Shape, Comparable<Shape> {

    private double radius;


    enum ShapeType {Circle, Rectangle}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.getPerimeter(),
                o.getPerimeter());
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Circle perimeter: "
                + df.format(this.getPerimeter());
    }
}
