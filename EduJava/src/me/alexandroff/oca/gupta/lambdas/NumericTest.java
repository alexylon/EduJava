package me.alexandroff.oca.gupta.lambdas;

interface NumericTest {
    boolean computeTest(int num);
}

class TestNumber {
    public static void main(String[] args) {
        NumericTest isPositive = num -> num >= 0;
        NumericTest isNegative = (int num) -> {
            return num < 0;
        };

        System.out.println("Number 5 is positive: "
                + isPositive.computeTest(5));

        System.out.println("Number 5 is negative: "
                + isNegative.computeTest(5));

    }
}
