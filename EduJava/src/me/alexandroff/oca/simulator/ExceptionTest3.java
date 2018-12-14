package me.alexandroff.oca.simulator;

public class ExceptionTest3 {
    void m1() {
        throw new NullPointerException();
    }

    void m2() throws Exception {
        throw new Exception();
    }
}
