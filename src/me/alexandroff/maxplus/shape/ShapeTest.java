package me.alexandroff.maxplus.shape;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ShapeTest {


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        Shape shape1 = new Circle(20);
        Shape shape2 = new Rectangle(10, 30);
        Shape shape3 = new Rectangle(2, 5);
        Shape[] shapes = new Shape[3];
        shapes[0] = shape1;
        shapes[1] = shape2;
        shapes[2] = shape3;


        System.out.println("The radius is: 20");
        System.out.println("The area of the circle is: "
                + df.format(shape1.getArea()));
        System.out.println("The perimeter of the circle is: "
                + df.format(shape1.getPerimeter()));
        System.out.println();

        System.out.println("Rectangle 'a' is: 10");
        System.out.println("Rectangle 'b' is: 30");
        System.out.println("The area of the rectangle is: "
                + df.format(shape2.getArea()));
        System.out.println("The perimeter of the rectangle is: "
                + df.format(shape2.getPerimeter()));
        System.out.println();


        System.out.println(Arrays.toString(shapes));
        Arrays.sort(shapes);
        System.out.println(Arrays.toString(shapes));
    }
}
