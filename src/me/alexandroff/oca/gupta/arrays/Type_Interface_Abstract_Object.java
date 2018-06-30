package me.alexandroff.oca.gupta.arrays;

interface MyInterface {
}

class MyClass1 implements MyInterface {
}

class MyClass2 implements MyInterface {
}

abstract class Vehicle {
}

class Car extends Vehicle {
}

class Bus extends Vehicle {
}

public class Type_Interface_Abstract_Object {

    public static void main(String[] args) {

        MyInterface[] interfaceArray = new MyInterface[]{
                new MyClass1(),
                null,
                new MyClass2()};

        Vehicle[] vehiclesArray = {
                new Car(),
                new Bus()
        };

        Object[] objArray = new Object[]{
                new MyClass1(),
                new MyClass2[5],
                null,
                new Car(),
                new Bus(),
                new Integer[7],
                new int[5]
        };
    }
}
