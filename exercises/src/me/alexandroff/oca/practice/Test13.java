package me.alexandroff.oca.practice;

public class Test13 {

    public static void main(String[] args) {
        String[] strings = {"stringValue1", "stringValue2"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        // againStrings[0] = new StringBuilder();
        // DOES NOT COMPILE. StringBuilder is not a String
        objects[0] = new String();
        // OK
        objects[1] = new StringBuilder();
        // careful! throws an ArrayStoreException
    }
}
