package me.alexandroff.oca.simulator;

// ALL interface methods MAY be overriden with
// abstract (instance) methods in a sub-abstract class
// In fact the static methods are only hidden

public interface IntAbstrClass {
    void m1();
    static void m2() {}
    default void m3() {}
}

abstract class MyClass implements IntAbstrClass {
    public abstract void m1();
    public abstract void m2(); //!!!
    public abstract void m3(); //!!!
}
