package me.alexandroff.oca.gupta.string_methods;

public class CharAt {

    public static void main(String... aaa) {

        String str1 = "Alexander";

        System.out.println(str1.charAt(1)
                + str1.charAt(3) + str1.charAt(5)
                + str1.charAt(6) + str1.charAt(8)); //???
        System.out.println(str1.charAt(1) + " "
                + str1.charAt(3) + " " + str1.charAt(5)
                + " " + str1.charAt(6) + " " + str1.charAt(8));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(5));
        System.out.println(str1.charAt(6));
        System.out.println(str1.charAt(8));

        System.out.println();

        for (int i = 0; i < 9; i++) {
            char letter = str1.charAt(i);

            if (letter == 'e') {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < 9; i++) {
            char letter = str1.charAt(i);
            System.out.print(letter);

        }
    }
}
