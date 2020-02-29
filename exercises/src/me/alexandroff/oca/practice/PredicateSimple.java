package me.alexandroff.oca.practice;

import java.util.*;
import java.util.function.Predicate;

public class PredicateSimple {
    public static void main(String[] args) {
        List<Family> family = new ArrayList<>();
        family.add(new Family("Alexander", 46));
        family.add(new Family("Ekaterina", 32));
        family.add(new Family("Anastasia", 6));
        family.add(new Family("Konstantin", 2));
        System.out.println("Family members: " + family);

        System.out.print("Adults: ");
        for (Family member : family) {
            Predicate<Family> p = m -> member.age > 17;
            if (p.test(member)) {
                System.out.print(member + ", ");
            }
        }
    }
}

class Family {
    String name;
    int age;

    Family(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name;
    }
}
