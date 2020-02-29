package me.alexandroff.oca.practice;

public class NumericTest {
    public static void main(String[] args) {
        short s1 = 1;
        byte b1 = 1;
        byte b2 = 2;
        short s2 = (short) +s1;
        byte b = (byte) (s1 + 2);
        b = (byte) (b1 & b2);
        // numeric promotion happens for bit-wise operators as well
        System.out.println(b);

        // !!!
        //the rules of numeric promotion do not apply to + +, --
        //and the compound assignment operators such as + =, -=, and *=
        byte c1 = 1;
        byte c2 = ++c1; // result of + + b1 will be a byte
        c2 = c1--; // result of b1-- will be a byte
        c1 *= c2; // result will be a byte
        double d = 1.0;
        float f = 2.0f;
        f += d; // result of will be a float

    }
}
