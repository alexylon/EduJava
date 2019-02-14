package me.alexandroff.hackerrank;

//How many pairs are in the array

import java.util.*;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        int i = 0;
        int j = 0;
        Arrays.sort(ar);

        outer:
        for (; i < ar.length; i++) {
            int count = 0;
            inner:
            for (; j < ar.length; j++) {
                if (i != j && ar[i] == ar[j]) {
                    count++;
                } else {
                    pairs += (count + 1) / 2;
                    System.out.println("Pairs: " + pairs);
                    break;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {

        int[] colors1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] colors2 = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        System.out.println(sockMerchant(9, colors1));
        System.out.println(sockMerchant(10, colors2));
    }
}
