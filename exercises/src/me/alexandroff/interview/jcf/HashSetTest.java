package me.alexandroff.interview.jcf;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(5);

        Set<String> set2 = new HashSet<>();
        set2.add("Konstantin");
        set2.add("Ekaterina");
        set2.add("Anastasia");
        set2.add("Alexander");
        set2.add("Konstantin");

        System.out.println(set);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(set2);
    }
}
