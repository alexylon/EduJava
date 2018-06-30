package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class Modify {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Zero");
        list1.add("One");
        list1.add("Two");
        list1.add("Four");
        list1.add(3, "Three");
        list1.set(2, "One and a Half");
        System.out.println(list1);

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Zero"));
        list2.add(new StringBuilder("One"));
        list2.add(new StringBuilder("Two"));
        for (StringBuilder element : list2) {
            element.append(" " + element.length());
        }
        for (StringBuilder element : list2) {
            System.out.println(element);
        }
    }
}
