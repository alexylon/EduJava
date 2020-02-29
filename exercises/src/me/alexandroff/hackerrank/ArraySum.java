package me.alexandroff.hackerrank;

public class ArraySum {

    public static void main(String[] args) {


        int[] ar = {1, 2, 3, 4, 10, 11};

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        System.out.println(sum);
    }

}
