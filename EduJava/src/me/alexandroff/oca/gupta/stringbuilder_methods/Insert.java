package me.alexandroff.oca.gupta.stringbuilder_methods;

public class Insert {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, "r"); // Inserts r at position 2
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Alexander");
        String st1 = "LALA";
        sb2.insert(2, st1, 1, 3); // Inserts "AL" !!!
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("123");
        char[] name = {'J', 'a', 'v', 'a'};
        sb3.insert(1, name, 1, 3); // Inserts "ava" !!!
        System.out.println(sb3);
    }
}
