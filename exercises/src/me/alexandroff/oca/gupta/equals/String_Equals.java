package me.alexandroff.oca.gupta.equals;

public class String_Equals {

    public static void main(String[] args) {

        String str1 = "Alexander";
        String str2 = "Alexander";
        String str3 = new String("Alexander");

        System.out.println(str1 == str2); // The same object
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3); // Different objects
        System.out.println(str1.equals(str3)); // Different objects but the same vavue
        System.out.println();

    }
}
