package me.alexandroff.oca.gupta.exception_handling;

//Though you shouldn’t handle errors in your code, what happens if you do? Will the
//exception handler that handles the code execute? See for yourself

public class TwistInTaleCatchError {
    public static void main(String args[]) {
        try {
            myMethod();
        } catch (StackOverflowError s) {
            for (int i = 0; i < 2; ++i)
                System.out.println(i);
        }
    }

    public static void myMethod() {
        myMethod();
    }
}

//We know that typically errors shouldn’t be handled programmatically
//and that they should be left for the JVM to take care of. Also, you can’t be sure that
//error-handling code for all the errors will execute. For example, error-handling code
//for StackOverFlowError may execute but (as the name suggests) may not execute for
//VirtualMachineError.
