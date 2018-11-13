package me.alexandroff.oca.simulator;

public class NullTest {
    static int a = 5;
    int b = 10;

    static void a() {
        System.out.println("a()");
    }

    void b() {
        System.out.println("b()");
    }
}

class NullTester {
    public static void main(String[] args) {
        NullTest obj = new NullTest();
        obj = null;
        System.out.println(obj.a);
        // There is NO NullPointerException, because 'a' is a static variable
        // OR
        System.out.println(NullTest.a);
        obj.a();
        // There is NO NullPointerException, because 'a()' is a static method
        // OR
        NullTest.a();

        System.out.println(obj.b);
        // NullPointerException, because 'b' is an instance variable
        obj.b();
        // NullPointerException, because 'b()' is an instance method
    }
}
