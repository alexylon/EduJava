package me.alexandroff.maxplus.java_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergeFiles {

    public static void main(String[] args) {

        FileReader fileReader1 = null;
        FileReader fileReader2 = null;
        Writer fileWriter = null;

        try {
            fileReader1 = new FileReader("/Users/alexandroff/file1.txt");
            fileReader2 = new FileReader("/Users/alexandroff/file2.txt");
            fileWriter = new FileWriter("/Users/alexandroff/result.txt");

            int data1;
            int data2;

            while ((data1 = fileReader1.read()) != -1) {
                System.out.print((char) data1);
                fileWriter.write((char) data1);

            }

            while ((data2 = fileReader2.read()) != -1) {
                System.out.print((char) data2);
                fileWriter.write((char) data2);

            }

            System.out.println();

        } catch (IOException e) {
            Logger.getLogger(TextInput.class.getName()).log(
                    Level.SEVERE, "Exception while reading file", e);

        } finally {
            if (fileReader1 != null) {
                try {
                    fileReader1.close();
                } catch (IOException ex) {
                    Logger.getLogger(TextInput.class.getName()).log(
                            Level.SEVERE, "Exception while closing the fileReader", ex);
                }
            }

            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (IOException ex) {
                    Logger.getLogger(TextInput.class.getName()).log(
                            Level.SEVERE, "Exception while closing the fileReader", ex);
                }
            }

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(TextInput.class.getName()).log(
                            Level.SEVERE, "Exception while closing the fileWriter", ex);
                }
            }
        }
    }
}
