package me.alexandroff.oca.gupta.inheritance;

// In a derived class, you’d normally
// use the implicit reference super to
//refer to a method or variable of a base class.
// Similarly, you’d normally use the implicit
//reference this to refer to a method or
// variable defined in the same class. A derived
//class contains within it an object of its base class
// and can access non-private members
//of its base class. A derived class can also refer
// to the members of its base class as its own
//members using the reference this.
// This approach is acceptable only if the same member
//isn’t defined in the derived class, that is,
// if there are no name collisions.

public class Employee5 {

    String name = "Emp";
    String address = "EmpAddress";
}

class Programmer5 extends Employee5 {
    String name = "Prog";

    void printValues() {
        System.out.print(this.name + ":");
        System.out.println(this.address);
        System.out.print(super.name + ":");
        System.out.print(super.address);
    }
}

class TwistInTale3 {
    public static void main(String args[]) {
        new Programmer5().printValues();
    }
}
