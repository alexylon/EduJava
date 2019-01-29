package me.alexandroff.oca.gupta.string_methods;

public class Concat {

    public static void main(String[] args) {

        String str1 = "Alexander ";
        String str2 = "Kroumov ";
        String str3 = "Alexandrov";
        String con1 = str1.concat(str3);
        String con2 = str1.concat(str2).concat(str3);
        //String con3 = str1.concat(1972); NO
        //String con4 = str1.concat(true); NO
        //String con5 = str1.concat('A'); NO, String only

        System.out.println(con1);
        System.out.println(con2);
    }
}
