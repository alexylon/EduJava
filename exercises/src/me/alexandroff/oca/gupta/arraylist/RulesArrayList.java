package me.alexandroff.oca.gupta.arraylist;

import java.util.*;

//1. Adding nulls: ArrayList supports null elements.
//2. Adding duplicates: ArrayList supports duplicate elements.
//3. Exceptions: None of the ArrayList methods throw NullPointerException.
// They throw IndexOutOfBoundsException if you try to access an element beyond the range of the list.
//4. Method chaining: Unlike StringBuilder, none of the ArrayList
// methods return a reference to the same ArrayList object.
// Therefore, it is not possible to chain method calls.


public class RulesArrayList {
    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<>();
        //al1.add("a").add("b"); DOES NOT COMPILE
        System.out.println(al1); // []

        ArrayList<String> al2 = new ArrayList<>();
        if (al2.add("a")) {
            if (al2.contains("a")) {
                al2.add(al2.indexOf("a"), "b");
            }
        }
        System.out.println(al2); // [b, a]

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("a");
        al3.add("b");
        al3.add(al3.size(), "x");
        System.out.println(al3); // [a, b, x]

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("b");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        // list1.add(list2); DOES NOT COMPILE
        list1.remove("b");
        System.out.println(list1); // [a, b]

        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        list3.add("a");
        list3.add("b");
        list4.add("b");
        list4.add("c");
        list4.add("d");
        list3.addAll(list4); // OK
        System.out.println(list3); // [a, b, b, c, d]
        list3.remove("b");
        System.out.println(list3); // [a, b, c, d]

        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<String> list6 = new ArrayList<>();
        list5.add("a");
        list5.add("b");
        list6.add("b");
        list6.add("c");
        list6.add("d");
        list5.addAll(list6);
        //list5.removeAll("b"); DOES NOT COMPILE
        list5.removeAll(list6); // Removes ALL matching elements
        System.out.println(list5); // [a]

    }
}
