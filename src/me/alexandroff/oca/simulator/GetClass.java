package me.alexandroff.oca.simulator;

interface I {
    int var = 10;
}

class E {
    final int VAR = 10;

    void printSmth() {
        System.out.println("Hello");
    }
}

class EE extends E implements I {
    final int VAR = 20;
    //'final' variables CAN be hidden

    /*
    var = 20;
    */
    //'var' in the interface is ALWAYS 'public', 'static', 'final'
    //and cannot be assigned a new value
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
