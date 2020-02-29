package me.alexandroff.oca.gupta.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTest {

    String name;

    ArrayListTest(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<StringBuilder> listSb = new ArrayList<>();
        listSb.add(new StringBuilder("Alexander"));
        listSb.add(new StringBuilder("Kroumov"));
        listSb.add(new StringBuilder("Alexandrov"));
        System.out.println(listSb.size());
        System.out.println(listSb);
        System.out.println(listSb.indexOf(new StringBuilder("Kroumov")));
        System.out.println(listSb.indexOf("Kroumov"));

        System.out.println();

        ArrayList<ArrayListTest> listTest = new ArrayList<>();
        listTest.add(new ArrayListTest("Alexander"));
        listTest.add(new ArrayListTest("Kroumov"));
        listTest.add(new ArrayListTest("Alexandrov"));
        for(ArrayListTest name : listTest) {
            System.out.println(name.getName());
        }
        System.out.println(listTest.indexOf(new ArrayListTest("Kroumov")));
        System.out.println(listTest.indexOf("Kroumov"));

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ArrayListTest) {
            ArrayListTest p = (ArrayListTest) obj;
            boolean isEqual = p.name.equals(this.name);
            return isEqual;
        } else
            return false;
    }

    public String getName() {
        return this.name;
    }
}
