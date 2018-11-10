package me.alexandroff.oca.gupta.exception_handling;

public class InvalidArrayAccess {
    //Without exception handler
    public static void main(String[] args) {
        String[] parents = new String[]{"Alexander", "Ekaterina"};
        System.out.println(parents[5]); // Throws ArrayIndexOutOfBoundsException and halts
        System.out.println("All seems to be well"); // Not printed
    }

}

class InvalidArrayAccessHandler {
    // With exception handler
    public static void main(String[] args) {
        String[] parents = {"Alexander", "Ekaterina"};

        try {
            System.out.println(parents[5]);
            // Throws ArrayIndexOutOfBoundsException and skips to "catch"
            System.out.println("This is not printed");
        } catch (ArrayIndexOutOfBoundsException e) { // Exception is handled
            System.out.println("The exception is handled");
        } finally {
            System.out.println("All seems to be well, " +
                    "but this is not the preferred way to treat runtime exceptions"); // Printed
        }
    }
}

class InvalidArrayAccessPropper {
    // On real projects, the preferred approach is to AVOID runtime exceptions
    //by including appropriate checks. For example, in the previous code, you can prevent
    //ArrayIndexOutOfBoundsException from being thrown by using appropriate checks:
    public static void main(String[] args) {
        String[] parents = {"Alexander", "Ekaterina"};
        int pos = 5;
        if (pos >= 0 && pos < parents.length)
            System.out.println(parents[pos]);

        System.out.println("All seems to be well, the exception is avoided");
    }
}
