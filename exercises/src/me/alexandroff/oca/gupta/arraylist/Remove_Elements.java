package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class Remove_Elements {

    public static void main(String... aaa) {

        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        StringBuilder sb0 = new StringBuilder("Zero");
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        StringBuilder sb5 = new StringBuilder("Five");
        myArrList.add(sb0);
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb3);
        myArrList.add(sb4);
        myArrList.add(sb5);

        myArrList.remove(0); //Removes "Zero"
        myArrList.remove(1); //Removes "Two"
        myArrList.remove(sb3); //Removes "Three"
        myArrList.remove("Five"); // Doesn't remove "Five"
        myArrList.remove(new StringBuilder("Five")); // Doesn't remove "Five"

        System.out.println(myArrList);

    }
}
