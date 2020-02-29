package me.alexandroff.maxplus.java_io;

import java.io.File;

public class DirList {

    public static void main(String[] args) {
        File dir = new File("/Users/alexandroff/Test");

        String[] fileNames = dir.list();
        File[] files = dir.listFiles();

        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
        System.out.println();

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file);
            } else if (file.isDirectory()) {
                System.out.println(file.getAbsolutePath());
            }

        }
    }
}
