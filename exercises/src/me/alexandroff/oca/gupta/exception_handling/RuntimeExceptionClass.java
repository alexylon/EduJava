package me.alexandroff.oca.gupta.exception_handling;

class MinimumNumberException extends RuntimeException {
    // This is a non-checked exception or runtime exception
}

public class RuntimeExceptionClass {

    void numberMethod(int number) {
        // "throws MinimumNumberException" may be omitted
        System.out.println("Minimum number is 5");
        if (number < 5) {
            throw new MinimumNumberException();
        }
    }
}

class TestMinimumNumber {
    public static void main(String[] args) {
        RuntimeExceptionClass runtimeExceptionClass = new RuntimeExceptionClass();
        runtimeExceptionClass.numberMethod(3);
        // Compiles successfully even though
        //main neither handles nor declares MinimumNumberException
    }
}
