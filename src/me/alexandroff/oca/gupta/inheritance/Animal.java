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

    Dog(String color, int legNumber) { // There should be at least a matching constructor

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

    Cat(String color, int legNumber) { super(color, legNumber); }

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
