package me.alexandroff.oca.gupta.inheritance;

public class Employee2 {

    String name;
}

class Programmer2 extends Employee2 {
    String name;

    void setNames() {
        this.name = "Programmer";
        super.name = "Employee";
    }

    void printNames() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

class UsingThisAndSuper {
    public static void main(String[] args) {
        Programmer2 programmer = new Programmer2();
        programmer.setNames();
        programmer.printNames();
    }
}

