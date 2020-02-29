package me.alexandroff.misc.figures;

public interface Figure {
    double calcArea();
}

class Rectangle implements Figure {
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }
}

class Circle implements Figure {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double calcArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
