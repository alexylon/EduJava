package JFC;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("2"); //Does not add it because cannot be duplicated in a set
        set.add("3");
        System.out.println(set);

        System.out.println(set.contains("2"));

        for (String t : set) {
            System.out.println(t);
        }

        System.out.println();
        set.forEach(e -> System.out.println(e)); // The same as above but with lambda expression
    }
}
