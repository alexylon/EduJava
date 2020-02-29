package me.alexandroff.oca.practice;

public interface Animal {
    default String getName() {
        return null;
    }
}

interface Mammal {
    default String getName() {
        return null;
    }

    String getColor();
}

abstract class Otter implements Mammal, Animal {
    abstract public String getName();
}

//An ABSTRACT class CANNOT inherit two interfaces that both define
//default methods with the same signature, unless the class implementing
//the interfaces overrides it with an abstract or concrete method

//If not implemented the two interface methods CANNOT be
//abstract and default with the same signatute

//It is NOT mandatory to implement abstract interface methods
//in an ABASTRACT class.

class Fox implements Mammal, Animal {
    public String getName() {
        return "Beauty";
    }
    //A class CANNOT inherit two interfaces that both define
//default methods with the same signature, unless the class implementing
//the interfaces overrides it with a concrete method

//If not implemented the two interface methods CANNOT be
//abstract and default with the same signatute

    public String getColor() {
        return "Red";
    }
    //All abstract interface methods MUST be
    //implemented (overriden) in a concrete class
}
