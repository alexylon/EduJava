package me.alexandroff.oca.simulator.a;

public class AccessTest {
    int a;
    private int b;
    protected int c;

    public AccessTest() {
    }
    //If extended by a class in another package, this constructor must be 'public'
    //or 'protected'. But if it is 'protected' then ref.var. and 'new object'
    //must not be both of type 'AccessTest'

    protected void c() {
    }
    // This method can be accessed in a child class WITHOUT reference variable
    // or the reference variable is NOT of super type (AccessTest)

    public int d() {
        return 0;
    }
}
