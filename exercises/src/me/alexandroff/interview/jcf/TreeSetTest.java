package me.alexandroff.interview.jcf;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(5);

        Set<String> set2 = new TreeSet<>();
        set2.add("Konstantin");
        set2.add("Ekaterina");
        set2.add("Anastasia");
        set2.add("Alexander");
        set2.add("Konstantin");

        System.out.println(set);
        System.out.println(set2);
    }
}
