package me.alexandroff.oca.practice;

interface First {
    String str = "First Var";

    static void mSt() {
        System.out.println("Static First");
    }

    default void mIns() {
        System.out.println("Instance First");
    }
}

class Second {
    String str = "Second Var";

    static void mSt() {
        System.out.println("Static Second");
    }

    public void mIns() {
        System.out.println("Instance Second");
    }
}

class Third extends Second implements First {
    public static void main(String[] args) {
        Third third = new Third();
        third.mSt();
        //The static method from the super class is inherited, thus it is printed.
        //The static method from the interface is NOT inherited,
        //thus it can be accessed ONLY by 'First'
        third.mIns();
        System.out.println(((Second) third).str);
        // MUST be casted, otherwise it is ambiguous
    }
}
