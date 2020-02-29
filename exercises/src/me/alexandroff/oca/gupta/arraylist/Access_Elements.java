package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Access_Elements {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Zero");
        list1.add("One");
        list1.add("Two");
        list1.add("Four");
        list1.add(3, "Three");

        for (String element : list1) { // 1
            System.out.println(element);
        }

        System.out.println();
        System.out.println(list1.get(3)); // 2
        System.out.println();

        ListIterator<String> iterator = list1.listIterator(); // 3
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        Iterator<String> it2 = list1.iterator(); // 4
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println();

        for (int i = 0; i < list1.size(); i++) { // 5
            System.out.println(list1.get(i));
        }


    }
}
