package me.alexandroff.oca.practice;

interface Iii {
}

class Aaa implements Iii {
}

class Bbb extends Aaa {
}

class Ccc extends Bbb {
}

class Tester {
    public static void main(String[] args) {
        Aaa a = new Aaa();
        Bbb b = new Bbb();

        Iii i = (Ccc) a;
        //ClassCastException

        a = (Bbb) (Iii) b;
        //class Bbb does implement Iii because it extends Aaa, which implements Iii.
        // Aaa reference of type Iii can be cast to any class at compile time.
        // Since Bbb is-a Aaa, it can be assigned to a.

        //b = (Aaa) b; - DOES NOT COMPILE
    }
}