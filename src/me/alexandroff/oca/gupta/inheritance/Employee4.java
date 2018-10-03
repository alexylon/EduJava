package me.alexandroff.oca.gupta.inheritance;

public class Employee4 {
    String name;
}

class Programmer extends Employee {
    String name;

    static void setNames() {
        // this.name = "Programmer";
        // !!! Can’t use "this" in static method
        // super.name = "Employee";
        // !!! Can’t use "super" in static method
    }
}

