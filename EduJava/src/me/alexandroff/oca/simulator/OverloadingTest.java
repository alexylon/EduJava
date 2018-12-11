package me.alexandroff.oca.simulator;

public class OverloadingTest {
    static void method1(String str) {
        System.out.println("String");
    }

    static int method1(Object obj) {
        System.out.println("Object");
        return 1;
    }

    static void method2(int intVar) {
        System.out.println("int");
    }

    static void method2(Integer integerVar) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        method1("word");
        // Java looks for the most specific type
        method1(56);
        // After seeing that there is no an int parameter
        // Java autoboxes the 'int' and it becomes an object

        method2(56);
        // Java looks for the most specific type
        method2(new Integer(5));
        // Java looks for the most specific type
    }
}


