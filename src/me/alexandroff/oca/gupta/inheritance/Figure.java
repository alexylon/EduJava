package me.alexandroff.oca.gupta.inheritance;

public interface Figure {

    double calcArea();

    Object printSmth();

    default int calcPerimeter() {
        return 0;
    }

    static int saySmth(int a) {
        return a * 2;
    }

}

class Rectangle implements Figure {

    private double a;
    private double b;

    Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() { // All overriden methods must be "public"
        return a * b;
    }

    @Override
    public Integer printSmth() {
        System.out.println("Hello!");
        return null;
    }

    @Override
    public int calcPerimeter() { // !!!The overriden "default" method must be "public"
        return (int) (2 * (a + b));
    }

    static int saySmth(int a) { // Static methods are not overriden, they are not related
        return a * 2;
    }

    public String toString() {
        return "Perimeter: " + this.calcPerimeter() + "\nArea: " + this.calcArea();
    }
}

class Test {

    public static void main(String[] args) {

        Figure rect1 = new Rectangle(5.0, 10.0);
        Figure rect2 = new Figure() {
            @Override
            public double calcArea() {
                return 0;
            }

            @Override
            public Object printSmth() {
                return null;
            }
        };
        Rectangle rect3 = new Rectangle(10.0, 20.0);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(Rectangle.saySmth(2));
        System.out.println(Figure.saySmth(3));
        System.out.println(((Rectangle) rect1).printSmth());

    }
}
