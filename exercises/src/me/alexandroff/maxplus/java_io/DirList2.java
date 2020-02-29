package me.alexandroff.maxplus.java_io;

import java.io.File;
import java.io.IOException;

public class DirList2 {

    public static void main(String[] args) {
        File dir = new File("/Users/alexandroff/Test");
        displayDirectoryContents(dir);
    }

    public static void displayDirectoryContents(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directory:" + file.getCanonicalPath());
                    displayDirectoryContents(file);
                } else {
                    System.out.println("     file:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
