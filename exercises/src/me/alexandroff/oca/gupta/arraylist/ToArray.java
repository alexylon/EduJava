package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class ToArray {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Alexander");
        list.add("Ekaterina");
        list.add("Anastasia");
        list.add("Konstantin");
        System.out.println(list);

        line1();

        String[] listArr = new String[list.size()];
        listArr = list.toArray(listArr);
        for (String element : listArr) {
            System.out.println(element);
        }


        line2();

        listArr[0] = "Alexandrov";
        System.out.println(list);
        line1();
        for (String element : listArr) {
            System.out.println(element);
        }
    }

    static void line1() {
        System.out.println();
    }

    static void line2() {
        System.out.println();
        System.out.println();
    }

    static void line3() {
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
