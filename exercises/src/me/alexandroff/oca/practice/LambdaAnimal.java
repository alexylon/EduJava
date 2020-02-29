package me.alexandroff.oca.practice;

import java.util.*;
import java.util.function.*;

class Animals {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animals(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

interface CheckTrait {
    boolean test(Animals a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animals a) {
        return a.canHop();
    }
}

class TraditionalSearch {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<Animals>();
        // list of animals
        animals.add(new Animals
                ("fish", false, true));
        animals.add(new Animals
                ("kangaroo", true, false));
        animals.add(new Animals
                ("rabbit", true, false));
        animals.add(new Animals
                ("turtle", false, true));

        System.out.println("Hoppers: ");
        print(animals, new CheckIfHopper()); // Without lambda
        // pass class that does check

        System.out.println();

        System.out.println("Swimmers: ");
        print(animals, a -> a.canSwim()); // With lambda
        print(animals, (a) -> a.canSwim());
        printP(animals, (Animals a) -> {
            return a.canSwim();
        });
        // print(animals, (a) -> {a.canSwim()});
        // DOES NOT COMPILE. Missing 'return' statement
        // print(animals, Animals a -> a.canSwim());
        // DOES NOT COMPILE. Missing parentheses when there is type
    }

    private static void print(List<Animals> animals,
                              CheckTrait checker) {
        for (Animals animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }

    // OR with Predicate

    private static void printP(List<Animals> animals,
                               Predicate<Animals> checker) {
        for (Animals animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}