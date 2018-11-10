package me.alexandroff.oca.simulator;

public class String_Equality {

    public static void main(String[] args) {
        String hel = "Hel", lo = "lo", hello = "Hello";
        char[] helloChar = new char[5];
        helloChar[0] = 'H';
        helloChar[1] = 'e';
        helloChar[2] = 'l';
        helloChar[3] = 'l';
        helloChar[4] = 'o';
        String CharStr = null;
        for (int i = 0; i < helloChar.length; i++) {
            CharStr += helloChar[i];
        }
        System.out.println(CharStr);

        System.out.println(hello == (hel + lo));
        // false
        System.out.println(hello.equals(hel + lo));
        // true
        System.out.println("Hello" == hello);
        // true
        System.out.println("Hello" == CharStr);
        // false
        System.out.println("Hello".equals(CharStr));
        // false
        System.out.println("Hello" == "Hel" + "lo");
        // true
        System.out.println(hello == "Hel" + "lo");
        // true
        System.out.println(hello == "Hel" + lo);
        // false
    }
}
