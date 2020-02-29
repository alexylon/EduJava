package me.alexandroff.interview.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 6, 4, 2, 1);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(binarySearch(numbers, 5));
        System.out.println(binarySearch(numbers, 8));
    }

    public static boolean binarySearch(final List<Integer> numbers,
                                       final Integer value) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }
        final Integer comparison = numbers.get(numbers.size() / 2);
        if (value.equals(comparison)) {
            return true;
        }
        if (value < comparison) {
            return binarySearch(
                    numbers.subList(0, numbers.size() / 2),
                    value);
        } else {
            return binarySearch(
                    numbers.subList(numbers.size() / 2 + 1, numbers.size()),
                    value);
        }
    }
}
