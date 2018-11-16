package me.alexandroff.oca.simulator;

public class InitializerTest2 {
    static {
        add(20);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    InitializerTest2() {
        add(50);
    }

    static {
        add(40);
    }

    {
        add(60);
    }

    static {
        new InitializerTest2();
    }

    {
        add(80);
    }
}

class YetMoreInitializationOrder extends InitializerTest2 {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }

    {
        add(8);
    }

    public static void main(String[] args) {
    }
}
