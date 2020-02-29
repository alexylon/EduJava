package me.alexandroff.oca.practice;

import java.io.IOException;

class OriginalMethods {

    void doSmth() throws Exception {
    }

    void takeSmth() throws Exception {
    }

    int count() {
        return 0;
    }

    Object shoot() {
        return null;
    }

    private void sleep() {
    }

    final void eat() {
    }
}

class OverridingMethods extends OriginalMethods {

    @Override
    void doSmth() throws IOException {
        System.out.println("Do something");
    }
    // An overriden method may throw the same or derived exceptions.
    // They must be of the same subset or not declare at all.

    @Override
    void takeSmth() {
        System.out.println("Take something");
    }
    // An overriden method might NOT declare exceptios at all

    @Override
    int count() {
        return 12;
    }
    // When primitives
    // overriding methods must have the same return type

    @Override
    OverridingMethods shoot() {
        return this;
    }
    // When objects
    // overriding methods may have derived return type

    /*
    @Override
    void sleep() {
        System.out.println("Sleep");
    }

    @Override
    void eat() {
        System.out.println("Eat");
    }
    */
    // 'private' and 'final' methods cannot be overriden
}
