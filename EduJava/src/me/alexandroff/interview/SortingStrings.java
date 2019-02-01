package me.alexandroff.interview;

import java.util.*;

public class SortingStrings {
    public static void main(String[] args) {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};
        Arrays.sort(numbers);
        for (int el : numbers)
            System.out.println(el);

        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected2 = {"abc", "x", "y", "z", "zazzy", "zzz"};
        Arrays.sort(strings);
        for (String el : strings)
            System.out.println(el);
    }
}
