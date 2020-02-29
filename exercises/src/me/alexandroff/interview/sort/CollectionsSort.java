package me.alexandroff.interview.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class CollectionsSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 6, 4, 2, 1);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
