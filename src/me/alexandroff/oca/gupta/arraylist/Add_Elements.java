package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class Add_Elements {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Zero");
        list1.add("One");
        list1.add("Two");
        list1.add("Four");

        System.out.println(list1);

        list1.add(3, "Three"); // Adds an element at pos.3
        System.out.println(list1);
    }

    ArrayList list2 = new ArrayList(2);


}
