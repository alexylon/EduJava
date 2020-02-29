package me.alexandroff.misc.cats;
//Inner anonymous classes

import java.util.Comparator;

import static java.util.Arrays.sort;

public class Cat {
    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void who() {
        System.out.println("From class Cat");
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " : " + age;
    }
}

class Test {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Sandra", 7);
        cats[1] = new Cat("Gioia", 10) {
            //Inner anonymous class 1 after the constructor
            void who() {
                System.out.println("From the anonymous class");
            }
        };
        cats[2] = new Cat("Sabrina", 2);

        sort(cats, new Comparator<Cat>() {
            //Inner anonymous class 2 after the constructor
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        cats[0].who(); //Triggers the overridden method in anonymous class 1
        cats[1].who(); //Triggers the original method
    }
}
