package me.alexandroff.oca.simulator;

//There are three ways to print an exception.
// You can let Java print it out, print just the message,
//or print where the stack trace comes from.

public class ExceptionPrinting {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
