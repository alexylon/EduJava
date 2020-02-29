package me.alexandroff.oca.gupta.exception_handling;
// !!!

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReturnFromCatchBlock {
    public static void main(String args[]) {
        openFile();
        System.out.println("End of 'main'");
    }

    private static void openFile() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found");
            return; // !!!
        } finally {
            System.out.println("finally");
        }

        System.out.println("After the block (if there is NO 'return')");
        //This is NOT printed if there is "return" in "catch"
        //The flow of control doesn’t return to the method "main"
        //when the "return" statement executes in the catch handler.
        //It returns to "main" after "finally".
        //If there is NO "return" in "catch" the flow control finishes
        //the current method before going to "main"

        //There are a few scenarios
        //in Java in which a "finally" block does not execute:
        //■ Application termination — The "try" or the "catch" block
        //executes "System.exit", which immediately terminates the application.
        //■ Fatal errors — A crash of the JVM or the OS occurs.
    }
}
