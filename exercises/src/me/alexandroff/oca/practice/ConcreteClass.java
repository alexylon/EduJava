package me.alexandroff.oca.practice;

public class ConcreteClass {
    public ConcreteClass(int a) {
        System.out.println("ConcreteClass");
    }

    public void m1() {
    }
}

abstract class AbstractClass extends ConcreteClass {
    AbstractClass(int m) {
        super(m);
        System.out.println("AbstractClass");
    }

    abstract public void m1();
    // The overridden method MAY be abstract if in an abstract class
}

class ConcreteSubClass extends AbstractClass {
    ConcreteSubClass(int s) {
        super(s);
        System.out.println("ConcreteSubClass");
    }

    public void m1() {
    }
}

class TestingClass {
    public static void main(String[] args) {
        new ConcreteSubClass(5);

        //new AbstractClass(6);
        // NO, abstract classes and interfaces CANNOT be instantiated

    }
}
