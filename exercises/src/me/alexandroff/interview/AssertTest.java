package me.alexandroff.interview;

public class AssertTest {
    public static void main(String[] args) {
        m1(5, 6);
    }

    static void m1(int x, int y) {
        assert (x > y) : "x = " + x + "y = " + y;
        System.out.println(x + y);
    }
}
