package me.alexandroff.maxplus.inheritance;

public class Dog extends Animal {

    private String dogBreed;

    public Dog(String dogBreed) {
        super("Dog", 4);
        this.dogBreed = dogBreed;
    }

    @Override
    public String toString() {
        return this.animalBreed + " is " + this.dogBreed
                + " and has " + this.numberOfLegs + " legs";
    }
}
