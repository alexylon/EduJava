package me.alexandroff.oca.practice;
// This is not on the exam
// A cool way to create an ArrayList

import java.util.List;
import java.util.Arrays;

public class CoolTrickArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);

        list.add("four");
        //??? UnsupportedOperationException
    }
}
