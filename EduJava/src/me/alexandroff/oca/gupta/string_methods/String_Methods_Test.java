package me.alexandroff.oca.gupta.string_methods;

public class String_Methods_Test {

    public static void main(String[] args) {

        String name = "  Alexander  ";

        System.out.println(":" + name + ":");
        //:  Alexander  :
        System.out.println(":" + name.trim() + ":");
        //:Alexander:
        System.out.println("First letter: "
                + name.trim().charAt(0));
        //First letter: A
        System.out.println("The index of "
                + name.trim().charAt(0) + " is: "
                + name.trim().indexOf("A"));
        //The index of A is: 0
        String fullName = name.trim().concat(" Alexandrov");
        System.out.println("My full name is: " + fullName);
        //My full name is: Alexander Alexandrov
        System.out.println("The length of my first name is: "
                + name.trim().length());
        //The length of my first name is: 9
        String firstName = name.trim();
        System.out.println(fullName.replace(" ",
                " Kroumov "));
        //Alexander Kroumov Alexandrov
        System.out.println("Is my last name 'Alexandrov'?: "
                + fullName.endsWith("Alexandrov"));
        //Is my last name 'Alexandrov'?: true
        System.out.println("'xan' starts at the 3-th symbol?: "
                + firstName.startsWith("xan", 3));
        //'xan' starts at the 3-th symbol?: true
        System.out.println("My last name is: "
                + fullName.substring(10));
        //My last name is: Alexandrov
        System.out.println("My name is lawful: "
                + firstName.substring(1, 4));
        //My name is lawful: lex

    }
}