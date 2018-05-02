package figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFigure {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(20));
        figures.add(new Circle(10));
        figures.add(new Rectangle(50, 100));
        figures.add(new Rectangle(10, 20));

        System.out.println(figures);
        System.out.println();

        for (Figure f : figures) {
            System.out.println(f);
        }
        System.out.println();

        Collections.sort(figures, new PerimeterComparator());
        for (Figure f : figures) {
            System.out.println(f);
        }


    }
}
