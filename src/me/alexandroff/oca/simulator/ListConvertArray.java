package me.alexandroff.oca.simulator;

import java.util.*;

public class ListConvertArray {
    public static void main(String[] args) {
        // List to Array
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        // specifies the type of the array and does what we actually want.
        // The advantage of specifying
        //a size of 0 for the parameter is that Java will create
        // a new array of the proper size for the
        //return value. If you like, you can suggest
        // a larger array to be used instead. If the ArrayList
        //fi ts in that array, it will be returned.
        // Otherwise, a new one will be created.
        System.out.println(stringArray.length); // 2

        // Array to List
        String[] array = {"hawk", "robin"}; // [hawk, robin]
        List<String> list2 = Arrays.asList(array); // returns fixed size list
        System.out.println(list2.size()); // 2
        list2.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list2.remove(1);
        // throws 'UnsupportedOperation Exception'
        // because we are not allowed to change the size of the list.

    }
}
