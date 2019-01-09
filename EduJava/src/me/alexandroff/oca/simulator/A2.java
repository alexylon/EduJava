package me.alexandroff.oca.simulator;

public class A2 {
    public static void main(String[] args) {
        A2 a = new A2();
        B2 b = new B2();
        a = b;
        //b = a; - NO
        // 'a' is declared of class A and 'b' is of B
        // which is a subclass of A.
        // So an explicit cast is needed.
        a = (B2) b;
        b = (B2) a;
    }
}

class B2 extends A2 {

}
