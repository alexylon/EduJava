package me.alexandroff.oca.gupta.inheritance;

public interface BaseInterface1 {

    String getName();

    default void saySmth() {
        System.out.println("Hello Alex");
    }
}

interface BaseInterface2 {

    String getName();

    default void saySmth() {
        System.out.println("Hello Katia");
    }
}

interface MyInterface extends BaseInterface1, BaseInterface2 {
    // The "parent" interfaces must have the same return type when names are the same

    String getName();

    default void saySmth() {
        System.out.println("Hello Anastasia");
        // Two different "default" methods with the same names in "parent" interfaces
        // MUST be overriden in "child" interface or class
    }
}
