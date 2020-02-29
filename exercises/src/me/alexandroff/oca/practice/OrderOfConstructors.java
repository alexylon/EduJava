package me.alexandroff.oca.practice;

//Inheritance of classes and their constructors

class Person {
    String name;

    Person(String name) {
        System.out.println(" In Person's constructor ");
        this.name = name;
    }
}

class Employee extends Person {
    String empId;

    Employee() {
        this(" dummy", "000");
        System.out.println(" In Employee() constructor ");
    }

    Employee(String name, String empId) {
        super(name);
        System.out.println(" In Employee(name, empid) constructor ");
    }
}

class Manager extends Employee {
    String grade;

    Manager(String grade) {
        System.out.println(" In Manager(grade) constructor ");
        this.grade = grade;
    }
}

class TestClass3 {
    public static void main(String[] args) {
        Manager m = new Manager(" A");
    }
}

