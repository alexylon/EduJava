package me.alexandroff.oca.practice;

public class Test21 {
    private Test21(Test21 t) {}

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
        System.out.println("counter = " + counter);
    }
}
