package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class AddAll {

    public static void main(String... zzz) {

        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> yourList = new ArrayList<>();

        myList.add("Zero");
        myList.add("One");
        yourList.add("Two");
        yourList.add("Three");
        System.out.println(myList);
        System.out.println(yourList);
        myList.addAll(2, yourList);
        System.out.println(myList);
    }
}
