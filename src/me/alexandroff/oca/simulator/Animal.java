package me.alexandroff.oca.simulator;

public interface Animal {
    default String getName() {
        return null;
    }
}

interface Mammal {
    String getName();
}

abstract class Otter implements Mammal, Animal {
    abstract public String getName();
}

//A class CANNOT inherit two interfaces that
//both define default methods with the same signature,
// unless the class implementing
//the interfaces overrides it with an abstract or concrete method

//If not implemented the two interface methods CANNOT be
//abstract and default with the same signatute

//Both interface methods CAN be abstract and not implemented
