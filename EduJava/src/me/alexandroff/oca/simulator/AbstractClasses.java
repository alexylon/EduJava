package me.alexandroff.oca.simulator;

abstract class Carnivor {
    abstract String getName();

    abstract int getLegsNumber();
}

abstract class BigCat extends Carnivor {
    abstract void roar();
    // Abstract subclasses may not implement
    // abstract parent methods

    int getLegsNumber() {
        return 4;
    }
    // A concrete subclass is not required to provide
    // an implementation for an abstract method if
    // an intermediate abstract class provides the implementation
}

class Lion extends BigCat {
    String getName() {
        return "Lion";
    }

    void roar() {
        System.out.println("The lion roars");
    }
    // Concrete subclasses MUST implement
    // ALL inherited abstract methods

    //abstract void abstractMethod();
    // DOES NOT COMPILE
    // NO abstract methods in a non-abstract class

    public static void main(String[] args) {
        BigCat lion = new Lion();
        //BigCat bigCat = new BigCat();
        // Abstract classes CANNOT be instantiated
    }
}

// Abstract Class Defi nition Rules:
//1. Abstract classes cannot be instantiated directly.
//2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract
//methods.
//3. Abstract classes may not be marked as private or final.
//4. An abstract class that extends another abstract class inherits all of its abstract methods
//as its own abstract methods.
//5. The first concrete class that extends an abstract class must provide an implementation
//for all of the inherited abstract methods.

//Abstract Method Defi nition Rules:
//1. Abstract methods may only be defined in abstract classes.
//2. Abstract methods may not be declared private or final.
//3. Abstract methods must not provide a method body/implementation in the abstract
//class for which is it declared.
//4. Implementing an abstract method in a subclass follows the same rules for overriding a
//method. For example, the name and signature must be the same, and the visibility of
//the method in the subclass must be at least as accessible as the method in the parent
//class.