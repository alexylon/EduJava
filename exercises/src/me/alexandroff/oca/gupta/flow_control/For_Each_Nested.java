package me.alexandroff.oca.gupta.flow_control;

import java.util.ArrayList;

public class For_Each_Nested {

    public static void main(String[] args) {

        ArrayList<String> exams = new ArrayList<String>();
        exams.add("Java");
        exams.add("Oracle");
        ArrayList<String> levels = new ArrayList<String>();
        levels.add("Basic");
        levels.add("Advanced");
        ArrayList<String> grades = new ArrayList<String>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedArrayList =
                new ArrayList<ArrayList<String>>();
        nestedArrayList.add(exams);
        nestedArrayList.add(levels);
        nestedArrayList.add(grades);

        for (ArrayList<String> nestedListElement : nestedArrayList)
            for (String element : nestedListElement)
                System.out.println(element);
        System.out.println();

        System.out.println(nestedArrayList);
        System.out.println();

        for (ArrayList<String> element : nestedArrayList) {
            System.out.println(element);
        }
    }
}
