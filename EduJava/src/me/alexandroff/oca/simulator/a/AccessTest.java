package me.alexandroff.oca.simulator.a;

public class AccessTest {
    int a;
    private int b;

    public AccessTest() {
    }
    //If extended by a class in another package, this constructor must be 'public'
    //or 'protected'. But if it is 'protected' then ref.var. and 'new object'
    //must not be both of type 'AccessTest'

    protected void c() {
    }

    public int d() {
        return 0;
    }
}
