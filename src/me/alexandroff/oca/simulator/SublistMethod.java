package me.alexandroff.oca.simulator;

import java.util.*;

public class SublistMethod {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Alex");
        arrList.add("Katia");
        arrList.add("Anastasia");
        System.out.println(arrList);
        System.out.println(arrList.subList(1, 1));
    }
}
