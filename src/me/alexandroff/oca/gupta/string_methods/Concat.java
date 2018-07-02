package me.alexandroff.oca.gupta.string_methods;

public class Concat {

    public static void main(String[] args) {

        String str1 = "Alexander ";
        String str2 = "Alexandrov";
        String str3 = "Kroumov ";
        String con1 = str1.concat(str2);
        String con2 = str1.concat(str3).concat(str2);

        System.out.println(con1);
        System.out.println(con2);
    }
}
