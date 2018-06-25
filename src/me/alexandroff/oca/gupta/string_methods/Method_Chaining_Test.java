package me.alexandroff.oca.gupta.string_methods;

public class Method_Chaining_Test {

    public static void main(String[] args) {

        String str1 = "  Alexander  ";
        int len1 = str1.length();
        int len2 = str1.trim().length();
        String ch1 = str1.trim().substring(3).concat(" Alexandrov");

        System.out.println(len1);
        System.out.println(len2);
        System.out.println(ch1);

        System.out.println("--------------");

        String day = "SunDday";
        day.replace('D', 'Z').substring(3);
        System.out.println(day);
        day = day.replace('D', 'Z').substring(3);
        System.out.println(day);

        System.out.println("----------------");

        String letters = "ABCAB";
        //System.out.println(letters.substring(0, 2).startsWith('A')); - Won't compile as a char
        System.out.println(letters.substring(0, 2).startsWith("A"));
    }
}
