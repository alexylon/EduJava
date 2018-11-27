package me.alexandroff.oca.simulator;

public class ConstructorTest {
    int i;

    public ConstructorTest() {
    }
}

class ConstructorTester extends ConstructorTest {
}

class ConstructorTest1 {
    int n;

    public ConstructorTest1(int i) {
    }
    // Call to 'super' not mandatory as the super constructor
    // has no parameters
}

class ConstructorTester1 extends ConstructorTest1 {
    ConstructorTester1() {
        super(10);
    }
    // Call to 'super' IS mandatory as the super constructor
    // HAS parameters
}
