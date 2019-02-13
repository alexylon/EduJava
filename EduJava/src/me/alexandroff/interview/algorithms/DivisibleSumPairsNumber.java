package me.alexandroff.interview.algorithms;

public class DivisibleSumPairsNumber {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (i != j) {
                    if ((ar[i] + ar[j]) % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count / 2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 2, 6, 1, 2};
        int div1 = divisibleSumPairs(6, 5, arr1);
        int div2 = divisibleSumPairs(6, 3, arr1);
        System.out.println(div1);
        System.out.println(div2);
    }
}
