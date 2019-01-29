package me.alexandroff.oca.practice;

import java.io.IOException;

class XXX {
    public void m() throws IOException {
        throw new IOException();
    }
}

class YYY extends XXX {
    public void m() {
    }
    //The overriding method may choose to throw the same or
    //narrower, or not to throw at all checked exception
    //While the caller method MUST throw the same
    //or broader checked exception

    public static void main(String[] args) {
        YYY obj = new YYY();
        XXX obj1 = new YYY();
        obj.m();
        //obj1.m();
        // - Unhandled exception
        //If 'XXX' chosen as the refference variable type, then
        //the 'main' method must throw or catch
        // the same or broader checked exception
    }
}

//This question is based on two concepts -
// 1. The overriding method may choose to have no throws clause
// even if the overridden method has a throws clause.
// Thus, the method m in YYY is valid.

// 2. Whether a call needs to be wrapped in a try/catch
// or whether the enclosing (caller) method requires a throws clause depends
// on the class of the reference and not the class of the actual object.
// This is because it is the compiler that checks whether a call needs
// to have exception handling and the compiler knows only about
// the declared class of a variable. It doesn't know about
// the actual object referred to by that variable
// (which is known only to JVM at run time).
// Here, if you define obj of type XXX, the call obj.m() will
// have to be wrapped into a try/catch because main() doesn't have
// a throws clause. But if you define obj of class YYY,
// there is no need of try catch because YYY's m() does not throw an exception.
// Now, if the declared class of obj is YYY, you cannot assign it
// an object of class XXX because XXX is a superclass of YYY.
// So the only option left is to do:  YYY obj = new YYY();
