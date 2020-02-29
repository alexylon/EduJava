package me.alexandroff.oca.practice;

import java.util.*;

public class Iterator_ListIterator {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Katia");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        ListIterator<String> listIt = names.listIterator();
        while (listIt.hasNext()) {
            if (listIt.next().equals("Alex")) {
                listIt.set("Anastasia");
            }
        }

        ListIterator<String> listIt2 = names.listIterator();
        while (listIt2.hasNext())
            System.out.println(listIt2.next());

        
    }
}
