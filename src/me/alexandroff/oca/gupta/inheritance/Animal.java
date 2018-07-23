package me.alexandroff.oca.gupta.inheritance;

public abstract class Animal {

    String color;
    int legNumber;

    Animal(String color, int legNumber) {
        this.color = color;
        this.legNumber = legNumber;
    }

    // There can be non-abstract methods
    void walks() {
        System.out.println("The " + this.getColor() + " animal is walking");
    }

    abstract void stops();

    String getColor() {
        return this.color;
    }
}

class Dog extends Animal {

    Dog(String color, int legNumber) { // There should be at least a matching constructor
        super(color, legNumber);
    }

    @Override // "abstract" methods must be overriden
    void stops() {

    }
}

class TestAnimal {
    public static void main(String[] args) {

        Animal dog1 = new Dog("White", 4);
        dog1.walks();
    }
}
