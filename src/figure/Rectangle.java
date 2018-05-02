package figure;

import java.text.DecimalFormat;

public class Rectangle extends Figure {

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double calcPerimeter() {
        return 2 * (x + y);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Rectangle perimeter: "
                + df.format(this.calcPerimeter());
    }
}
