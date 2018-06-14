package JCF;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add("one");
        list1.add("java");
        list1.add(3);
        list1.add(1);
        list1.add(new Character('J'));
        System.out.println(list1);
        System.out.println("Contains 'Java'?: " + list1.contains("java"));
        System.out.println("Index of 'Java': " + list1.indexOf("java"));
        System.out.println("Size of the list: " + list1.size());
        System.out.println();

        for (Object f : list1) {
            System.out.println(f);
        }

        list1.remove(1);
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.addAll(list1);
        System.out.println(list2);
    }
}
