package me.alexandroff.oca.gupta.inheritance;

public interface BaseInterface1 {

    String getName();

    // void color() {System.out.println("pink");}
    //- Won't compile, interface abstract methods cannot have body

    default void saySmth() {

        System.out.println("Hello BaseInterface1");
    }
}

interface BaseInterface2 {

    String getName();

    default void saySmth() {

        System.out.println("Hello BaseInterface2");
    }
}

interface MyInterface extends BaseInterface1, BaseInterface2 {
    // The "parent" interface methods must have
    // the same return type when names are the same

    String getName();

    default void saySmth() {
        System.out.println("Hello MyInterface");
        // Two different "default" methods
        // with the same names in "parent" interfaces
        // MUST be overriden in "child" interface or class
    }
}

class MyClass implements MyInterface {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void saySmth() {
        System.out.println("Hello MyClass");

    }

    public static void main(String[] args) {
        // new MyInterface().saySmth();
        // - Interfaces CANNOT be instantiated

        new MyClass().saySmth();
        // "Hello MyClass"

        MyInterface myInt = new MyClass();
        myInt.saySmth();
        // "Hello MyClass"

        BaseInterface1 baseInterface1 = new MyClass();
        baseInterface1.saySmth();
        // "Hello MyClass"
    }
}
