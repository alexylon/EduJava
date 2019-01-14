package me.alexandroff.oca.practice;

public interface InterfaceTest {
    default void m1() {
        System.out.println("Interface");
    }
}

class ClassTest implements InterfaceTest {
    public static void main(String[] args) {
        new ClassTest().m1();
    }
}
