package me.alexandroff.oca.simulator;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new RuntimeException();
        }
    }
}
