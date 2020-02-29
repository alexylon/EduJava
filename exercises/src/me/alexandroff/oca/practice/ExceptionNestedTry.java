package me.alexandroff.oca.practice;

class MyException1 extends Exception {
}

public class ExceptionNestedTry {
    public static void main(String[] args) {
        int i = 5;

        try {
            if (i == 0)
                throw new Exception();
        } catch (Exception e) {
            try {
                throw new MyException1();
            } catch (MyException1 n) {
            }
        }
    }
}
