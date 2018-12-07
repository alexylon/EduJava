package me.alexandroff.oca.simulator;

class MyException extends Exception {
}

class YourException extends Exception {
}

class HisException extends YourException {
}

public class ExceptionChecked {
    public static void main(String[] args) throws MyException {
        m1();
        // Declare

        try {
            m2();
        } catch (YourException e) {
            System.out.println("Caught");
        }
        // Or catch
    }

    public static void m1() throws MyException {
    }

    public static void m2() throws YourException {
    }

    public void m3() throws YourException {
    }

    public void m4() {
    }

    public void m5() {
    }
}

class SubExceptionChecked extends ExceptionChecked {
    public static void m1() {
    }
    // Doesn't throw at all

    public static void m2() throws YourException {
    }
    // Throws the same exception

    public void m3() throws HisException {
    }
    // Throws a sub-exception

    //public static void m2() throws Exception {} - NO
    //public void m4() throws MyException{} - NO
    // No new or super-exceptions
    // If the super-method throws a checked exception
    // Overriden methods may throw the same exception,
    // a sub-exception or not throw anything at all.
    // They CANNOT throw a new exception or a super-exception

    // BUT

    public void m5() throws NullPointerException {
    }
    // An overriden methods CAN throw runtime exceptions even
    // if the super-method does not
}
