package me.alexandroff.oca.practice;

import java.util.*;

public class ArrayListTest {
    static int i = 10;

    public static void main(String[] args) {
        List<Double> al = new ArrayList<>();
        al.add(10.0);
        //al.add(10); - NO
        // 'int' cannot be boxed to a 'Double' object.
        // It accepts ONLY a 'Double'

        System.out.println(al.size());
        System.out.println(new ArrayListTest().m1());
    }

    int m1() {
        return this.i;
    }
    // A static member can be accessed by a non-static method.
}
