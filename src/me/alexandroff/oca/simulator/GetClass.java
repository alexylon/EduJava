package me.alexandroff.oca.simulator;

class E {
    void printSmth() {
        System.out.println("Hello");
    }
}


class EE extends E {
}


class TestClassE {
    public static void main(String[] args) throws Exception {
        E a = new E();
        EE aa = new EE();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
    }
}
