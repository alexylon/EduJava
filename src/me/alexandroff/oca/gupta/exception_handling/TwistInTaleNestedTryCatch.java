package me.alexandroff.oca.gupta.exception_handling;

import java.io.*;

public class TwistInTaleNestedTryCatch {
    static FileInputStream players, coach;

    public static void main(String args[]) {
        try {
            players = new FileInputStream("players.txt");
            System.out.println("players.txt found");
            try {
                coach.close();
            } catch (IOException e) {
                System.out.println("coach.txt not found");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("players.txt not found");
        } catch (NullPointerException ne) {
            System.out.println("NullPointerException");
        }
    }
}

//The question assumes that a text
//file players.txt exists on your system so that the following code won’t throw a FileNot-
//FoundException exception:
//players = new FileInputStream("players.txt");
//The code defined for this question doesn’t initialize the static variable coach before
//executing the following code, which is bound to throw a NullPointerException:
//coach.close();
//The previous line of code is defined in the inner try block, which doesn’t define an
//exception handler for the exception NullPointerException. This exception is propagated
//to the outer exception-handler block. The outer exception handler catches the
//NullPointerException thrown by the inner try block and executes the appropriate
//exception handler. Hence, the code prints the following:

//players.txt found
//NullPointerException