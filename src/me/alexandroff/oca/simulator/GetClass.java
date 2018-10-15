package me.alexandroff.oca.simulator;

class A {
}

class AA extends A {
}


class TestClass3 {
    public static void main(String[] args) throws Exception {
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());


    }
}
