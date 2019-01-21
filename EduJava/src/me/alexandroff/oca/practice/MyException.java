package me.alexandroff.oca.practice;

class MyException2 extends Exception {
}

class TestClassEx {
    public void m1() throws MyException2 {
        throw new MyException2();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        TestClassEx tc = new TestClassEx();
        try {
            tc.m1();
        } catch (MyException2 e) {
            //tc.m1(); - Unhandled exception
        } finally {
            tc.m2();
        }
    }


}
