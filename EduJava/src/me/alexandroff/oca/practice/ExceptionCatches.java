package me.alexandroff.oca.practice;

public class ExceptionCatches {
    public static void main(String[] args) {
        try {
            System.out.println("work real hard");
        } catch (IllegalArgumentException e) {
            // First more specific (sub-exception class)
        } catch (RuntimeException e) {
            // Then the super-exception class
        } catch (StackOverflowError e) {
            // Exceptions from other inheritance branches also allowed
        }
    }
}

