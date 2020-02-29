package me.alexandroff.oca.gupta.string_methods;

public class StartsWith_EndsWith {

    public static void main(String[] args) {

        String str1 = "Alexander";

        Boolean st1 = str1.startsWith("Al");
        Boolean st2 = str1.startsWith("al");
        Boolean st3 = str1.startsWith("xan", 3);
        Boolean st4 = str1.startsWith("lex");
        //Boolean st5 = str1.startsWith('A');
        // !!! Won't copile as a char
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);

        System.out.println();

        Boolean en1 = str1.endsWith("der");
        System.out.println(en1);

    }
}
