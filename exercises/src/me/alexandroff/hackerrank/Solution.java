package me.alexandroff.hackerrank;

import static java.lang.Math.abs;

public class Solution {

    static int diagonalDifference(int[][] ar) {
        int sum1 = 0;
        int sum2 = 0;

        int a = (ar.length);
        int x = a;

        for (int i = 0; i < a; i++) {


            sum1 += ar[i][i];
            sum2 += ar[i][--x];


        }

        int sum = sum1 - sum2;
        return Math.abs(sum);

    }


    public static void main(String[] args) {

        int[][] ar = new int[3][3];
        ar[0][0] = 11;
        ar[0][1] = 2;
        ar[0][2] = 4;
        ar[1][0] = 4;
        ar[1][1] = 5;
        ar[1][2] = 6;
        ar[2][0] = 10;
        ar[2][1] = 8;
        ar[2][2] = -12;


        int result = diagonalDifference(ar);
        System.out.println(result);


    }
}
