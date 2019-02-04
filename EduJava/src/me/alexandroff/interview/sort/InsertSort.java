package me.alexandroff.interview.sort;

import java.util.*;

public class InsertSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 6, 4, 2, 1);
        System.out.println(numbers);
        System.out.println(insertSort(numbers));

    }

    public static List<Integer> insertSort(final List<Integer> numbers) {
        final List<Integer> sortedList = new ArrayList<>();
        originalList:
        for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        return sortedList;
    }
}
