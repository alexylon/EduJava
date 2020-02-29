package me.alexandroff.hackerrank;

import java.util.Arrays;

public class MagicSquare {

    static int formingMagicSquare(int[][] s) {
        int result = 0;
        if (s[1][1] != 5) {
            result = Math.abs(5 - s[1][1]);
            s[1][1] = 5;
        }

        int x = (5 - s[2][2]);
        result += Math.abs((5 + x) - s[0][0]);
        s[0][0] = (5 + x);

        int y = (5 - s[2][0]);
        result += Math.abs((5 + y) - s[0][2]);
        s[0][2] = (5 + y);


        result += Math.abs((5 + (y - x)) - s[1][0]);
        s[1][0] = (5 + (y - x));

        result += Math.abs((5 + (x - y)) - s[1][2]);
        s[1][2] = (5 + (x - y));

        result += Math.abs((5 - y - x) - s[0][1]);
        s[0][1] = (5 - y - x);

        result += Math.abs((5 + (y + x)) - s[2][1]);
        s[2][1] = (5 + (y + x));

        System.out.println(Arrays.deepToString(s));



       /* if ((s[0][0] + s[1][1] + s[2][2]) != 15) {
            result += Math.abs(15 - (s[0][0] + s[1][1] + s[2][2]));
        }
        if ((s[0][2] + s[1][1] + s[2][0]) != 15) {
            result += Math.abs(15 - (s[0][2] + s[1][1] + s[2][0]));
        }
        if ((s[1][0] + s[1][1] + s[1][2]) != 15) {
            result += Math.abs(15 - (s[1][0] + s[1][1] + s[1][2]));
        }
        if ((s[0][1] + s[1][1] + s[2][1]) != 15) {
            result += Math.abs(15 - (s[0][1] + s[1][1] + s[2][1]));
        }*/


        return result;


    }

    public static void main(String[] args) {
        int[][] s1 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};// 1
        int[][] s2 = {{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};// 4
        int[][] s3 = {{2, 9, 8}, {4, 2, 7}, {5, 6, 7}};// 21
        int[][] s4 = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};// 7

        int result1 = formingMagicSquare(s1);
        int result2 = formingMagicSquare(s2);
        int result3 = formingMagicSquare(s3);
        int result4 = formingMagicSquare(s4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println();

    }
}
