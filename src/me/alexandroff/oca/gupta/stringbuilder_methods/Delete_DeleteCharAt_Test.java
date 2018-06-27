package me.alexandroff.oca.gupta.stringbuilder_methods;

public class Delete_DeleteCharAt_Test {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Alexander");
        sb1.delete(1, 6); // Deletes positions 1 to 6 (not inclusive)
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Alexander");
        sb2.deleteCharAt(3);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Alexander");
        sb3.deleteCharAt(3).insert(5, "an");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Alexander");
        sb4.deleteCharAt(3).insert(5, "banana", 1, 3);
        System.out.println(sb4);
    }
}
