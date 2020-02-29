package me.alexandroff.maxplus.figure;

import java.text.DecimalFormat;

public class Circle extends Figure {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Circle perimeter: "
                + df.format(this.calcPerimeter());
    }
}
