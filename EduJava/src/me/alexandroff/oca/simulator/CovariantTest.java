package me.alexandroff.oca.simulator;

public class CovariantTest {
    Double m1() {
        return 10.0;
    }

    Object m2() {
        return null;
    }
}

class subCovariantTest extends CovariantTest {
    /*
    Integer m1() {
        return 5;
    }
    NO, since Integer is not a subclass of Double
    */

    subCovariantTest m2() {
        return null;
    }
    // OK since the overriden return type
    // is a subclass of Object
}
