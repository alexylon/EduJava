package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class Clone {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alexander");
        myList.add("Kroumov");
        myList.add("Alexandrov");

        ArrayList<String> assignedList = myList;
        ArrayList<String> clonedList = (ArrayList<String>) myList.clone(); // Creates a different object but doesn't copy the elements

        System.out.println(myList);
        System.out.println(assignedList);
        System.out.println(clonedList);
        System.out.println();

        System.out.println(myList == assignedList); // The same object
        System.out.println(myList == clonedList); // Different objects (but the same elements)
        System.out.println(myList.equals(clonedList));
        System.out.println();

        System.out.println(myList.get(0) == assignedList.get(0)); // The same elements
        System.out.println(myList.get(0) == clonedList.get(0)); // The same elements
    }

}
