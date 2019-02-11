package me.alexandroff.interview.algorithms;

//Write an algorithm that prints all numbers between 1 and n, replacing multiples
//of 3 with the String "Fizz", multiples of 5 with "Buzz", and multiples of 15 with
//"FizzBuzz".

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(final int n) {
        final List<String> toReturn = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                toReturn.add("FizzBuzz");
            } else if (i % 3 == 0) {
                toReturn.add("Fizz");
            } else if (i % 5 == 0) {
                toReturn.add("Buzz");
            } else {
                toReturn.add(Integer.toString(i));
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(30);
        System.out.println(list);
    }
}
