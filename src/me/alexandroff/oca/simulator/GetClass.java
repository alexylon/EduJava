package me.alexandroff.oca.simulator;

class E {
}

class EE extends E {
}


class TestClass3 {
    public static void main(String[] args) throws Exception {
        E a = new E();
        EE aa = new EE();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
    }
}
