package me.alexandroff.oca.practice;


class A5 {
    public A5() {
    }

    public A5(int i) {
        System.out.println(i);
    }
}

class B5 {
    static A5 s1 = new A5(1);
    A5 a = new A5(2);

    public static void main(String[] args) {
        B5 b = new B5();
        A5 a = new A5(3);
    }

    static A5 s2 = new A5(4);
}

