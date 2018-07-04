package me.alexandroff.oca.gupta.stringbuilder_methods;

public class Append {

    public static void main (String[] args) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Alexander");
        sb1.append('K');
        sb1.append(1972);
        sb1.append(true);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder(sb1);
        System.out.println(sb2);

        //StringBuilder sb3 = "Ekaterina Alexandrova"; - Won't compile. Can create StringBuilder type only with "new"
        StringBuilder sb3 = new StringBuilder("Ekaterina Alexandrova");
        sb3.append(" M").append(" 1986 ").append(true);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder();
        char[] name = {'J', 'a', 'v', 'a', '8'};
        sb4.append(name, 1, 3);
        System.out.println("sb4: " + sb4);
    }
}
