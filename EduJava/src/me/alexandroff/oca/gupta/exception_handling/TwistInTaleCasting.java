package me.alexandroff.oca.gupta.exception_handling;

class Ink2 {
}

interface Printable2 {
}

class ColorInk2 extends Ink2 implements Printable2 {
}

class BlackInk2 extends Ink {
}

public class TwistInTaleCasting {
    public static void main(String args[]) {
        Printable2 printable = null;
        BlackInk2 blackInk = new BlackInk2();
        printable = (Printable2) blackInk; //will throw runtime exception
    }
}
