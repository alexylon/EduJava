package me.alexandroff.oca.gupta.string_methods;

public class Operators_Test {

    public static void main(String[] args) {

        String str1 = "Alexander";
        String str2 = " Kroumov";
        String str3 = " Alexandrov";
        String str4 = null;
        int int1 = 5;
        int int2 = 10;

        str1 += str3;

        System.out.println(str1);
        str4 += str1;
        System.out.println(str4); // Outputs "nullAlexander Alexandrov"
        System.out.println(int1 + int2 + str2);
        System.out.println("" + int1 + int2 + str2);
        System.out.println(str2 + int1 + int2);
        System.out.println(str2 + (int1 + int2));
        System.out.println(str2.trim() + (int1 + int2));
    }
}
