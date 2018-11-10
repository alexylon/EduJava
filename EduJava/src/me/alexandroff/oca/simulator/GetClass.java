package me.alexandroff.oca.simulator;

interface I {
    int var = 10;
    //'var' must be initialized because it is
    //ALWAYS 'public', 'static', 'final'

}

class E {
    final int VAR = 10;
    //'VAR' must be initialized because it is final
    static int statVar = 10;
    int instVar;
    String instStr;

    E(int instVar, String instStr) {
        this.instVar = instVar;
        this.instStr = instStr;
    }

    void printSmth() {
        System.out.println("Hello");
    }
}

class EE extends E implements I {
    final int VAR = 20;
    //'final' variables CAN be hidden
    String subString;

    EE(int instVar, String instStr, String subString) {
        super(instVar, instStr);
        this.subString = subString;
    }
    //!!! The constructor in subclass must have the parameters
    //from the superclass and must call it at the first line

    EE(String instStr, String subString, int instVar) {
        super(instVar, instStr);
        this.subString = subString;
    }
    //Overloaded constructor

    /*
    var = 20;
    */
    //'var' in the interface is ALWAYS 'public', 'static', 'final'
    //and cannot be assigned a new value
}


class TestClassE {
    public static void main(String[] args) throws Exception {
        E a = new E(5, "Alex");
        EE aa = new EE(10, "Alex", "Katia");
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
    }
}
