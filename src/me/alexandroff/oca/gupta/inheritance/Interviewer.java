package me.alexandroff.oca.gupta.inheritance;

// With Java 8, you can use the keyword "this" in a default method to
//access the methods of an interface and its constants.
//You can’t use the "this" keyword to access "static" methods of an interface.

interface Interviewer2 {
    int MIN_SAL = 9999;

    default void submitInterviewStatus() {
        System.out.println(this);
        System.out.println(this.MIN_SAL);
        System.out.println(this.print());
    }

    String print();

}

class Manager implements Interviewer2 {
    public String print() {

        return ("I am " + this);
    }
}

class Foo {
    public static void main(String rags[]) {
        Interviewer2 m = new Manager();
        m.submitInterviewStatus();
    }
}
