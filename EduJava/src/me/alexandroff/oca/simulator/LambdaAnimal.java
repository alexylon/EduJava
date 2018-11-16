package me.alexandroff.oca.simulator;

import java.util.*;

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
        List<Animals> animals = new ArrayList<Animals>(); // list of animals
        animals.add(new Animals("fish", false, true));
        animals.add(new Animals("kangaroo", true, false));
        animals.add(new Animals("rabbit", true, false));
        animals.add(new Animals("turtle", false, true));

        System.out.print("Hoppers: ");
        print(animals, new CheckIfHopper()); // Without lambda
        // pass class that does check

        System.out.print("Swimmers: ");
        print(animals, a -> a.canSwim()); // With lambda
    }

    private static void print(List<Animals> animals, CheckTrait checker) {
        for (Animals animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}