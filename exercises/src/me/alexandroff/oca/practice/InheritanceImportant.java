package me.alexandroff.oca.practice;

interface Iii {
}

class Aaa implements Iii {
    String str = "A var";

    static void mSt() {
        System.out.println("A static method");
    }

    void mInst() {
        System.out.println("A instance method");
    }
}

class Bbb extends Aaa {
    String str = "B var";

    /*static void mSt() {
        System.out.println("B static method");
    }*/

    void mInst() {
        System.out.println("B instance method");
    }
}

class Ccc extends Bbb {
    String str = "C var";

    /*static void mSt() {
        System.out.println("C static method");
    }*/

    void mInst() {
        System.out.println("C instance method");
    }
}

class Tester {
    public static void main(String[] args) {
        Aaa a = new Aaa();
        Aaa aa = new Aaa();
        Bbb b = new Bbb();
        Aaa ac = new Ccc();
        Ccc c = new Ccc();

        //Iii i = (Ccc) b;
        //ClassCastException

        a = (Bbb) (Iii) b;
        //class Bbb does implement Iii because it extends Aaa, which implements Iii.
        // Aaa reference of type Iii can be cast to any class at compile time.
        // Since Bbb is-a Aaa, it can be assigned to a.

        //b = (Aaa) b; - DOES NOT COMPILE

        System.out.println(a.str);
        System.out.println(b.str);
        System.out.println(ac.str);
        System.out.println(c.str);

        ac.mSt();
        b.mSt();
        c.mSt();
        aa.mInst();
        ac.mInst();
        b.mInst();
    }
}