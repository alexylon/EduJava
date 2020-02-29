package me.alexandroff.hackerrank;

import java.util.*;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        outer:
        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if ((i + j) == s.size()) {
                    break outer;
                }
                sum += s.get(i + j);
            }

            if (sum == d) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 2, 1, 3, 2);
        System.out.println(birthday(list1, 4, 2));
    }
}
