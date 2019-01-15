package me.alexandroff.oca.practice;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] multiArr = {{1, 2, 3}, {}, {4, 5, 6}};
        int k = 0;
        for (int i = 0; i < multiArr.length; i++) {
            k++;
            System.out.println("multiArr No." + k + ": ");
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.println(multiArr[i][j]);
            }
        }

        int m = 0;
        int[][] multiArr2 = {{7, 8, 9}};
        for (int i = 0; i < multiArr2.length; i++) {
            m++;
            System.out.println("multiArr2 No." + m + ": ");
            for (int j = 0; j < multiArr2[i].length; j++) {
                System.out.println(multiArr2[i][j]);
            }
        }
    }
}
