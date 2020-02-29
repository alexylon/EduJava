package me.alexandroff.oca.practice;

public class ObjectTest {
    void printObject(Object o) {
        System.out.println("Printing object...");
    }
}

class ObjectTester {
    public static void main(String[] args) {
        new ObjectTest().printObject("Hello");
        new ObjectTest().printObject((new Integer(5)));
    }
}
