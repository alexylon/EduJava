package me.alexandroff.interview.algorithms;

//Bon Appetit

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {

        bill.remove(k);
        int sum = 0;
        for (int el : bill) {
            sum += el;
        }

        int toPay = sum / 2;

        if ((b - toPay) == 0)
            System.out.println("Bon Appetit");

        if ((b - toPay) != 0)
            System.out.println(b - toPay);

    }

    public static void main(String[] args) {
        List<Integer> bill1 = new ArrayList<>(Arrays.asList(3, 10, 2, 9));
        List<Integer> bill2 = new ArrayList<>(Arrays.asList(3, 10, 2, 9));
        bonAppetit(bill1, 1, 12);
        bonAppetit(bill2, 1, 7);
    }
}
