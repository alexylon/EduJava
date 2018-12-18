package me.alexandroff.oca.simulator;

public class ArrayMulti {
    public static void main(String[] args) {
        int i = 4;
        int ia[][][] = new int[i][i = 3][i];
        System.out.println(ia.length + ", "
                + ia[0].length + ", " + ia[0][0].length);

        int ib[][] = new int[5][6];
        System.out.println(ib.length + ", " + ib[0].length);

        int x1 = 5;
        int x2 = x1++;
        int x3 = ++x1;
        System.out.println(x1 + ":" + x2 + ":" + x3);
    }
}
