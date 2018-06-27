package me.alexandroff.oca.gupta.stringbuilder_methods;

public class Replace_Test {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("01234567");
        sb1.replace(2, 4, "ABCD");
        System.out.println(sb1);

        String st1 = "0123456";
        String rep1 = st1.replace("23", "ABCD");
        System.out.println(rep1);
        System.out.println(st1);
    }
}
