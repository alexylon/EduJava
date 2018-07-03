package me.alexandroff.oca.gupta.equals;

public class Test {

    int int1;

    public Test(int int1) {
        this.int1 = int1;
    }

    public static void main(String[] args) {


        Test test1 = new Test(3);
        Test test2 = new Test(3);

//The if comparison does the same thing that the overridden `.equals()` method does.
        if (test1.equals(test2))

        {
            System.out.println("test1 and test2 are true in .equals()");
        } else {
            System.out.println("test1 and test2 are false in .equals()");
        }
    }

    // Override .equals method.
    public boolean equals(Object object) {
        if (object instanceof Test && ((Test) object).int1 == this.int1) {
            return true;
        } else {
            return false;
        }
    }
}