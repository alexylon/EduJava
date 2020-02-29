package me.alexandroff.oca.practice;

public class ForLoopDouble {
    public static void main(String[] args) {
        int[][] ab = {{1, 2, 3}, {4, 5}};
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                System.out.print(ab[i][j] + " ");
                if (ab[i][j] == 2) {
                    break;
                }
            }
            continue;
            //Doesn't change anything
        }
    }
}
