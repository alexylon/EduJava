package me.alexandroff.maxplus.java_io;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextInput {

    public static void main(String[] args) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("/Users/alexandroff/text_input.txt");
            int data;


            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            Logger.getLogger(TextInput.class.getName()).log(
                    Level.SEVERE, "Exception while reading file", e);

        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(TextInput.class.getName()).log(
                            Level.SEVERE, "Exception while closing the fileReader", ex);
                }
            }
        }

    }
}
