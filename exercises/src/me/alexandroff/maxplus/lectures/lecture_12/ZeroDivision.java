package me.alexandroff.maxplus.lectures.lecture_12;

import java.io.IOException;

public class ZeroDivision {

    public static void main(String[] args) {
        testMethod1();
        try {
            testMethod2();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void testMethod1() {
        try {
            System.out.println(10 / 0);
            System.out.println("call");
        } catch (Exception ex) {
            System.err.println("Arithmetic error: " + ex.getMessage());
        }

    }

    public static void testMethod2() throws IOException {
        throw new IOException("Wrong file");
    }
}
