package me.alexandroff.interview.jcf;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        ll.add(4);
        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);

        Iterator<Integer> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
