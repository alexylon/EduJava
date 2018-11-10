package me.alexandroff.oca.gupta.exception_handling;

class MaximumNumberException extends Exception {
    // !!! This means that the exception is checked
}

public class CheckedExceptionClass {

    void numberMethod(int number) throws MaximumNumberException {
        System.out.println("Maximum number is 10");
        if (number > 10) throw new MaximumNumberException();
    }
}

// !!! Must follow handle-or-declare rule

class TestNumber {
    public static void main(String[] args) {
        CheckedExceptionClass checkedExceptionClass = new CheckedExceptionClass();
        // checkedExceptionClass.numberMethod(11); - Won't compile. "main" neither handles
        //nor declares MaximumNumberException
    }
}

class Handle {
    public static void main(String[] args) {
        CheckedExceptionClass checkedExceptionClass = new CheckedExceptionClass();

        try {
            checkedExceptionClass.numberMethod(11);
        } catch (MaximumNumberException e) {
            System.out.println("Handled Exception1: " + e);
        }
    }
}

class Declare {
    public static void main(String[] args) throws MaximumNumberException {
        CheckedExceptionClass checkedExceptionClass = new CheckedExceptionClass();
        checkedExceptionClass.numberMethod(11);
    }
}

class HandleAndDeclare {
    public static void main(String[] args) throws MaximumNumberException {
        CheckedExceptionClass checkedExceptionClass = new CheckedExceptionClass();

        try {
            checkedExceptionClass.numberMethod(11);
        } catch (MaximumNumberException e) {
            System.out.println("Handled Exception2: " + e);
        }
    }
}
