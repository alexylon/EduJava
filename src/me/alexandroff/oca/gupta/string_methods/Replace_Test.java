package me.alexandroff.oca.gupta.string_methods;

public class Replace_Test {

    public static void main(String[] args) {

        String str1 = "Alexander";

        String rep1 = str1.replace("e", "E");
        String rep2 = str1.replace('e', 'E');
        //String rep3 = str1.replace('e', "E"); - Won't compile
        System.out.println(rep1);
        System.out.println(rep2);

        String rep4 = str1.replace("er", "rova");
        System.out.println(rep4);
    }
}
