package me.alexandroff.maxplus.jfc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<String> listA = new ArrayList<>();

        listA.add("element 4");
        listA.add("element 2");
        listA.add("element 1");

        System.out.println(listA.toString());

        //Sort
        Collections.shuffle(listA);
        System.out.println(listA.toString());
        System.out.println(listA.indexOf("element 2"));
        System.out.println(listA.get(listA.indexOf("element 2")));

        Collections.sort(listA);
        System.out.println(listA.toString());

        Collections.reverse(listA);
        System.out.println(listA.toString());
    }
}
