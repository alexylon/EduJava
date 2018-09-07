package me.alexandroff.oca.gupta.inheritance;

//!!! There’s a major difference in how Java accesses
//the variables and methods for these objects.
// With inheritance, the instance variables bind at compile time (to classes)
// and the methods bind at runtime (to objects).

class Employee6 {
    String name = "Employee";

    void printName() {
        System.out.println(name);
    }
}

class Programmer6 extends Employee6 {
    String name = "Programmer";

    void printName() {
        System.out.println(name);
    }
}

class Office1 {
    public static void main(String[] args) {
        Employee6 emp = new Employee6();
        Employee6 programmer = new Programmer6();

        // Variables are bound at compile time.
        System.out.println(emp.name);
        System.out.println(programmer.name); // Prints "Employee".
        // "programmer" is a variable of type "Employee"

        System.out.println();

        // Methods are bound at runtime; which
        //method executes depends on the type of
        //object on which it’s called.
        emp.printName();
        programmer.printName(); // Prints "Programmer".
        // "programmer" is a refference to an object of type "Programmer"
        //"printName()" in class Programmer CAN be removed, then the output will be "Employee"
        //"printName()" in class Employee CANNOT be removed
    }
}