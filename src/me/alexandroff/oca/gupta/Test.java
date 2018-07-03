package me.alexandroff.oca.gupta;

public class Test {

    int n;

    public Test(int n) {
        this.n = n;
    }

    public static void main(String[] args) {


        Test test1 = new Test(3);
        Test test2 = new Test(3);

//The if comparison does the same thing that the overridden `.equals()` method does.
        if (test1.equals(test2))

        {
            System.out.println("test1 and test2 are true in .equals()");
        }
        else {
            System.out.println("test1 and test2 are false in .equals()");
        }
    }

    // Override .equals method.
    /*public boolean equals(Object object) {
        if(object instanceof Test && ((Test)object).getValue() == this.n) {
            return true;
        } else {
            return false;
        }
    } */
}