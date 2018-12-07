package me.alexandroff.oca.simulator;

import java.util.*;

public class ArrayEqualityTest {
    public static void main(String[] args) {
        int[] intArr1 = {1, 2, 3, 4};
        int[] intArr2 = {1, 2, 3, 4};
        System.out.println(intArr1 == intArr2);
        System.out.println(intArr1.equals(intArr2));

        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        intList1.add(1);
        intList1.add(2);
        intList2.add(1);
        intList2.add(2);
        System.out.println(intList1 == intList2);
        System.out.println(intList1.equals(intList2));
    }
}
