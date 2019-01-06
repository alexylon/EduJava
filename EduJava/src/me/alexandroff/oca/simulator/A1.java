package me.alexandroff.oca.simulator;

class A1 {
    A1(int i) {
        System.out.println("A1");
    }
}

class B1 extends A1 {
    B1(int i) {
        super(i);
        System.out.println("B1");
    }


    public static void main(String[] args) {
        new A1(5);
        //A1
        System.out.println();
        new B1(5);
        //A1
        //B1
    }
}
