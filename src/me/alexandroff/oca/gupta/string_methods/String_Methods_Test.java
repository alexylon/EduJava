package me.alexandroff.oca.gupta.string_methods;

public class String_Methods_Test {

    public static void main(String[] args) {

        String name = "  Alexander  ";

        System.out.println(":" + name + ":");
        System.out.println(":" + name.trim() + ":");
        System.out.println("First letter: "
                + name.trim().charAt(0));
        System.out.println("The index of "
                + name.trim().charAt(0) + " is: "
                + name.trim().indexOf("A"));
        String fullName = name.trim().concat(" Alexandrov");
        System.out.println("My full name is: " + fullName);
        System.out.println("The length of my first name is: "
                + name.trim().length());
        String firstName = name.trim();
        System.out.println(fullName.replace(" ",
                " Kroumov "));
        System.out.println("Is my last name 'Alexandrov'?: "
                + fullName.endsWith("Alexandrov"));
        System.out.println("'xan' starts at the 3-th symbol?: "
                + firstName.startsWith("xan", 3));
        System.out.println("My last name is: "
                + fullName.substring(10));
        System.out.println("My name is lawful: "
                + firstName.substring(1, 4));

    }
}