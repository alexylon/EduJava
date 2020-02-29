package me.alexandroff.interview.search;

import java.util.Arrays;
import java.util.List;

public class MySearch1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 6, 4, 2, 1, 5);
        System.out.println(numbers);
        System.out.println(search(numbers, 5));
        System.out.println(search(numbers, 8));
    }

    static boolean search(List<Integer> numbers, Integer x) {
        boolean bool = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(x)) {
                bool = true;
            }
        }
        return bool;
    }
}