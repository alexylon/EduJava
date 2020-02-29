package me.alexandroff.oca.gupta.exception_handling;

//Although you can define code to handle errors, you shouldn’t. You should instead
//let the JVM handle the errors. The following example shows how it’s possible to
//catch an error:

public class CatchError {
    public static void main(String args[]) {
        try {
            myMethod();
        } catch (StackOverflowError s) {
            System.out.println(s);
        }
    }

    public static void myMethod() {
        System.out.println("myMethod");
        myMethod();
    }
}
