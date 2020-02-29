package me.alexandroff.oca.gupta.inheritance;

public abstract class Animal {

    String color;
    int legNumber;

    Animal(String color, int legNumber) {
        this.color = color;
        this.legNumber = legNumber;
    }

    // There CAN be non-abstract methods
    void walks() {
        System.out.println("The " +
                this.color + " animal is walking");
    }

    abstract void stops();

    String saySmth() {
        return "A word";
    }


    String getColor() {
        return this.color;
    }
}

class Dog extends Animal {

    Dog(String color, int legNumber) {
        // There should be at least a matching constructor

        super(color, legNumber);
       /* NO
       this.color = color;
       this.legNumber = legNumber; */
    }

    @Override
        // "abstract" methods MUST be overriden
    void stops() {

        System.out.println("The dog stopped");
    }

    String whatIsThis() {
        return "This is a dog";
    }
}

class Cat extends Animal {

    Cat(String color, int legNumber) {
        super(color, legNumber);
    }

    void stops() {
        System.out.println("The cat stopped");
    }

    String whatIsThis() {
        return "This is a cat";
    }
}

class TestAnimal {
    public static void main(String[] args) {

        Animal dog1 = new Dog("White", 4);
        Cat cat1 = new Cat("Grey", 4);
        dog1.walks();
        System.out.println(((Dog) dog1).whatIsThis());
        System.out.println(dog1.saySmth());
        System.out.println(cat1.whatIsThis());
    }
}

//1. Abstract class doesn't necessarily have to have an abstract method
// but if a class has an abstract method, it must be declared abstract.
// In other words, a concrete class cannot have an abstract method.

//2. An abstract class cannot be instantiated irrespective of whether
// it has an abstract method or not.

//3. A final class or a final method cannot be abstract.

//4. A final class cannot contain an abstract method
// but an abstract class may contain a final method.

//5. A private method is always final.

//6. A private method can never be abstract.

//7. A static method can be final but can never be abstract.
