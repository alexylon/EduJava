package me.alexandroff.oca.simulator;

class Animal2 {
}

class Cat extends Animal2 {
}

class Dog extends Animal2 {
}

class AnimalCastTest {
    public static void main(String[] args) {
        Animal2 a = new Cat(); // line1
        Dog d = (Dog) a; // line2 - ClassCastException
        // Cat c = (Cat) d; // line3 - DOES NOT COMPILE
    }
}

// The compiler doesn't care to which object reference
// variable a is referring to, it's only interested in
// the type of the reference variable. In line2 the compiler
// doesn't have any knowledge about the type of the actual
// object reference variable a is referring to. It only knows
// the type of a is Animal and because Dog extends Animal,
// the compiler allows this cast, because a could refer
// to a Dog object. The same applies to line3: the compiler
// doesn't know anything about the type of the actual object
// reference variable d, it only knows that the type of d is Dog
// and because Dog and Cat are siblings (and thus not in the same
// class hierarchy), there is NO way d can refer to a Cat object
// and therefore you'll get a compiler error on line3.

