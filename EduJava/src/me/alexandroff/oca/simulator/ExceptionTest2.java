package me.alexandroff.oca.simulator;

public class ExceptionTest2 {
    public static void main(String[] args) {
        String type = "moose";
        Object obj = type;
        Integer number = (Integer) obj; // ClassCastException

        //The compiler sees a cast from Object to Integer.
        // This could be okay. The compiler
        //doesn’t realize there’s a String in that Object.

        String type2 = "goose";
        // Integer type3 = type2; - DOES NOT COMPILE
    }
}
