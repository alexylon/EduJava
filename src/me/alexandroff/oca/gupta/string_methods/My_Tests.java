package me.alexandroff.oca.gupta.string_methods;

public class My_Tests {

    public static void main(String[] args) {

        String str1 = "Alexander";
        StringBuilder sb1 = new StringBuilder("Alexander");
        str1.concat(" Alexandrov"); // String is immutable
        sb1.append(" Alexandrov"); // StringBuilder is mutable
        System.out.println(str1);
        System.out.println(sb1);
        System.out.println();

        String str2 = 15 + 2 + "SUN" + 4 + 5;
        StringBuilder sb2 = new StringBuilder(15 + 2 + "SUN" + 4 + 5);
        System.out.println(str2);
        System.out.println(sb2);
    }
}
