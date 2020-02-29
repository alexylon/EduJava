package me.alexandroff.oca.practice;

// An interface may not be marked as final

interface T1 {
    void m1();

    default int d1() {
        return 1;
    }
}

interface T2 {
    int VALUE = 10;
    // Member variables are ALWAYS 'public static final'

    void m2();
    // Methods are ALWAYS 'public abstract'
    // except 'default' and 'static' methods

    void m1(); // OK

    // int m1();
    // The code doesn’t compile in the sub-interface or the sub-class,
    // as the interfaces define two methods with
    //the same name and input parameters but different return types

}

interface T3 extends T1, T2 {
    public void m3();

    public void m1(int x);

    static String hello() {
        return "Hello";
    }
    // static methods are never abstract

    default String bye() {
        return "Bye bye";
    }
    // default methods are never abstract

    int d1();
    // default interface methods MAY be overriden with
    // abstract methods in sub-interfaces or sub-abstract classes.
    // But then they must be implemented in concrete classes
}

class myClass implements T3 {

    // ALL overriden methods MUST be 'public'
    // as they are 'public' in interfaces

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m1(int x) {

    }
    // If the method name is the same but the input parameters are different,
    // there is no conflict because this is considered a method overload.

    public int d1() {
        return 100;
    }
}

//1. Interfaces cannot be instantiated directly.
//2. An interface is not required to have any methods.
//3. An interface may not be marked as final.
//4. All top-level interfaces are assumed to have public or default access,
//and they must include the abstract modifier in their definition.
//Therefore, marking an interface as private, protected, or final will trigger
//a compiler error, since this is incompatible with these assumptions.
//5. All non-default methods in an interface are assumed to have the modifiers
//abstract and public in their definition. Therefore, marking a method as
//private, protected, or final will trigger compiler errors as these are
//incompatible with the abstract and public keywords.

// Inheriting an Interface
//1. An interface that extends another interface, as well as an abstract class that
//implements an interface, inherits all of the abstract methods as its own abstract
//methods.
//2. The first concrete class that implements an interface, or extends an abstract class
//that implements an interface, must provide an implementation for all of the inherited
//abstract methods.
