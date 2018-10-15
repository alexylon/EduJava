package me.alexandroff.oca.simulator;

class TestClass4 {
    public static void main(String[] args) throws Exception {
        TestClass4 tc = new TestClass4();
        tc.myMethod();
    }

    public void myMethod() throws Exception {
        yourMethod();
    }

    public void yourMethod() throws Exception {
        throw new Exception();
    }
}
