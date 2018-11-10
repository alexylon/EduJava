package me.alexandroff.oca.gupta.string_methods;

public class Concat {

    public static void main(String[] args) {

        String str1 = "Alexander ";
        String str2 = "Kroumov ";
        String str3 = "Alexandrov";
        String con1 = str1.concat(str3);
        String con2 = str1.concat(str2).concat(str3);

        System.out.println(con1);
        System.out.println(con2);
    }
}
