package me.alexandroff.interview.algorithms;

import java.util.*;

//Given an array of integers, find and print the maximum number of integers
// you can select from the array such that the absolute difference between
// any two of the chosen integers is less than or equal to 1.


public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int max = 0;

        for (int i = a.size() - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                int d = a.get(i) - a.get(j);
                if (d <= 1) {
                    System.out.println(a.get(j));
                }
            }
            break;
        }

        /*for (int i = a.size() - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                int d = a.get(i) - a.get(j);
                if (d == 0) {
                    a.remove(j);
                }
            }
            break;
        }*/

        System.out.println(a);

        return max;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
        //List<Integer> list2 = Arrays.asList(4, 6, 5, 3, 3, 1);

        System.out.println(pickingNumbers(list1));
        //System.out.println(pickingNumbers(list2));
    }
}
