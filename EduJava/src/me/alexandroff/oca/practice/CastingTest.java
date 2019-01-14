package me.alexandroff.oca.practice;

public class CastingTest {
}

class CastingTester extends CastingTest {
    public static void main(String[] args) {
        // CastingTester test1 = new CastingTest(); - Compile time error
        CastingTester test1 = (CastingTester) new CastingTest();
        // ClassCastException
    }
}
