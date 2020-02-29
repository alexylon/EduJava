package me.alexandroff.oca.gupta.exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CaseBaseExceptionBeforeDerived {
    public static void main(String args[]) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            fis.close();
        } catch (IOException ioe) {
            System.out.println("IOException");
        } /*catch (FileNotFoundException fnfe) {
            System.out.println("file not found");
        } */
        // !!! Won't compile, FileNotFoundException is a derived class of IOException,
        // FileNotFoundException extends IOException.
        // The order should be reversed
    }
}
