package me.alexandroff.misc.animals;

public class Animal {
    private String name;
    private int age;
    String str = "Variable from Animal";

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void method1() {
        System.out.println("Method from Animal");
    }

    public String toString() {
        return "The age of the " + this.getClass().getSimpleName() + " "
                + name + " is " + age;
    }
}

class Dog extends Animal {
    String str = "Variable from Dog";

    Dog(String name, int age) {
        super(name, age);
    }

    void method1() {
        System.out.println("Method from Dog");
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }
}


