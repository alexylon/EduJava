package me.alexandroff.oca.practice;

public class StringTest2 {
    int x;

    public static void main(String[] args) {
        System.out.println("String".replace('g', 'G') == "String".replace('g', 'G'));
        System.out.println("String".replace('g', 'g') == "String");
        int i = 5___3;
        float f = 5.5f;
        System.out.println(i == f);
        System.out.println(10 % 30);
        System.out.println(i);
        System.out.println(new Boolean("tRue"));

        StringBuilder sb4 = new StringBuilder();
        char[] name = {'J', 'a', 'v', 'a', '8'};
        sb4.append(name, 1, 3);
        System.out.println("sb4: " + sb4);
    }

}
