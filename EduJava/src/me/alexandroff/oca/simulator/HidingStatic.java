package me.alexandroff.oca.simulator;

public class HidingStatic {
    static int getInt() {
        return 1;
    }
}

class HidingStatic2 extends HidingStatic {
    /*
    static String getInt() {
        return "Hello";
    }

    int getInt() {
    }
    */
    // Both DOES NOT COMPILE

    static int getInt() {
        return 2;
    }
}

class HidingStaticTest {
    public static void main(String[] args) {
        System.out.println(HidingStatic.getInt());
        System.out.println(HidingStatic2.getInt());
    }
}
