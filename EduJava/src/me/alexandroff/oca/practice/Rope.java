package me.alexandroff.oca.practice;

public class Rope {
    public static int length = 0;
}

class RopeSwing {
    static Rope rope1 = new Rope();
    static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}