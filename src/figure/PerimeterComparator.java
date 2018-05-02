package figure;

import java.util.*;

public class PerimeterComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure o1, Figure o2) {
        return (int) o1.calcPerimeter() - (int) o2.calcPerimeter();
    }
}
