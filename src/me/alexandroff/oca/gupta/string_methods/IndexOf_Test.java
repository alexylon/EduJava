package me.alexandroff.oca.gupta.string_methods;

public class IndexOf_Test {

    public static void main(String[] args) {

        String str1 = "Alexander";

        System.out.println(str1);
        System.out.println("Index of 'x': " + str1.indexOf('x'));
        System.out.println("Index of ''x'': " + str1.indexOf("x"));
        System.out.println("Index of ''xan'': " + str1.indexOf("xan"));
        System.out.println("Index of 'e': " + str1.indexOf("e"));
        System.out.println("Index of 'e' from pos.3: " + str1.indexOf('e', 3));
        System.out.println("Index of 'u': " + str1.indexOf('u'));



        System.out.println();
        System.out.println(str1.equals("Alexander"));

    }
}
