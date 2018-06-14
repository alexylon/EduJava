package me.alexandroff.maxplus.inheritance;

public class Animal {

    protected String animalBreed;
    protected int numberOfLegs;

    public Animal(String animalBreed, int numberOfLegs) {
        this.animalBreed = animalBreed;
        this.numberOfLegs = numberOfLegs;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void walk() {
        System.out.println("Animal walks");
    }

}
