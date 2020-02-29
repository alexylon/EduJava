package me.alexandroff.maxplus.jfc;

import java.util.Objects;

public class Animal {

    private String breed;

    Animal(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(breed);
    }

}

class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog");
        Animal animal2 = new Animal("Cat");
        Animal animal3 = new Animal("Dog");

        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal3));
    }
}
