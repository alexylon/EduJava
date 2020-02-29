package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class Access_Individual_Elements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Zero");
        list.add("One");
        list.add("Two");
        list.add("Four");
        list.add(3, "Three");
        list.add("Zero");
        System.out.println(list);

        System.out.println("list.get(4): " + list.get(4));
        System.out.println("list.size(): " + list.size());
        System.out.println("list.contains(\"Two\"): "
                + list.contains("Two"));
        System.out.println("list.contains(\"Five\"): "
                + list.contains("Five"));
        System.out.println("list.indexOf(\"Three\"): "
                + list.indexOf("Three"));
        System.out.println("list.indexOf(\"Five\"): "
                + list.indexOf("Five"));
        System.out.println("list.lastIndexOf(\"Zero\"): "
                + list.lastIndexOf("Zero"));

        System.out.println();
        System.out.println("list.contains(new String (\"Two\")): "
                + list.contains(new String ("Two")));
    }
}
