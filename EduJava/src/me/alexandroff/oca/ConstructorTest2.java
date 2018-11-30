package me.alexandroff.oca;

public class ConstructorTest2 {
    ConstructorTest2(int n) {
    }
}

interface InterfaceTest2 {
    // InterfaceTest2(double db) { }
    // NO constructors in interfaces

    //InterfaceTest2(String str2);
    // Abstract methods with the interface name
    // NOT allowed
}

class ConstructorTester2 extends ConstructorTest2 {
    ConstructorTester2() {
        super(5);
    }
}

abstract class ConstructorTest3 {
    ConstructorTest3(String str) {
    }
    // Abstract classes HAVE constructors
}

class ConstructorTester3 extends ConstructorTest3 {
    ConstructorTester3(double db) {
        super("Word");
    }
}

// Inheriting a class gives you access to all of the public
// and protected methods of the class, but special rules for
// constructors and overriding methods must be followed or the
//code will not compile. For example, if the parent class
//doesn’t include a no-argument constructor, an explicit call
//to a parent constructor must be provided in the child’s constructors.
// Pay close attention on the exam to any class that defines
//a constructor with arguments and doesn’t define a no-argument constructor.
