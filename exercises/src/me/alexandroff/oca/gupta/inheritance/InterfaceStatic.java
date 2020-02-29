package me.alexandroff.oca.gupta.inheritance;

public interface InterfaceStatic {
    static void m1() {
    }
}

class ClassStatic {
    static void m2() {
    }
}

class TestStatic extends ClassStatic implements InterfaceStatic {
    public static void main(String[] args) {
        TestStatic ts = new TestStatic();
        /*
        ts.m1(); // DOES NOT COMPILE
        */
        //Interface static methods are NOT inherited
        ts.m2();
        //Class static methods ARE inherited
    }
}