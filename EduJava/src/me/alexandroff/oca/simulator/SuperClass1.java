package me.alexandroff.oca.simulator;

class SuperClass1 {
    SuperClass1(int m) {
    }

    SuperClass1() {
    }
}

class SubClass1 extends SuperClass1 {
    int i, j, k;

    public SubClass1(int m, int n) {
        i = m;
        j = m;
    } //SuperClass1() is required in class SuperClass1

    public SubClass1(int m) {
        super(m);
    }
    //SuperClass1(int m) is required in class SuperClass1
}
