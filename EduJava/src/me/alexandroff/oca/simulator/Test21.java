package me.alexandroff.oca.simulator;

public class Test21 {
    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            middle:
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
                inner:
                for (int k = 0; k < 3; k++) {
                    System.out.println("k = " + k);
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
