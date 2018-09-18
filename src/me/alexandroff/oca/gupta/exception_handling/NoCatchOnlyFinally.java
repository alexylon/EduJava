package me.alexandroff.oca.gupta.exception_handling;

//Syntactically, you can define a try block that might only be followed by a finally block:

public class NoCatchOnlyFinally {
    public static void main(String args[]) {
        String name = null;
        try {
            System.out.println("Try block : open resource 1");
            System.out.println("Try block : open resource 2");
            System.out.println("in try : " + name.length());
            System.out.println("Try block : close resources");
        } finally {
            System.out.println("finally : close resources");
        }
    }
}

//Because main() in the preceding code throws an unchecked exception, NullPointer-
//Exception, it compiles successfully. But if the code enclosed within a try block declares
//to throw a checked exception, either it must be followed by a catch block, or the
//method in which it is defined must declare to throw it.
