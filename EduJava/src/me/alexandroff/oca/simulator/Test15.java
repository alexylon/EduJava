package me.alexandroff.oca.simulator;

public class Test15 {

    public static void main(String[] args) throws Exception {

        int[][] a = {{00, 01}, {10, 11}};
        int i = 99;
        try {
            a[val()][i = 1]++;
        } catch (Exception e) {
            System.out.println(i + ", " + a[1][1]);
        }


    }

    static int val() throws Exception {
        throw new Exception("unimplemented");
    }
}

