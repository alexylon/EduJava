package me.alexandroff.interview.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MySearch2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 6, 4, 2, 1);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers, 5));
        System.out.println(Collections.binarySearch(numbers, 3));
        System.out.println(Collections.binarySearch(numbers, 8));
    }
}
