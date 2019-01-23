package me.alexandroff.oca.practice;

public class BooleanTest {
    static boolean a;
    static boolean b;
    static boolean c;

    public static void main(String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
        //true, false, false
    }
}

//Java parses the expression from left to right.
// Once it realizes that the left operand of a conditional "or" operator
// has evaluated to true, it does not even try
// to evaluate the right side expression and never reaches 'c'.