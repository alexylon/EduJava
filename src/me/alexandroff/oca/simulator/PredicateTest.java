package me.alexandroff.oca.simulator;

import java.util.ArrayList;
import java.util.function.Predicate;

class FamilyMember {
    String name;
    int birthYear;

    FamilyMember(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String toString() {
        return "\nName: " + this.name
                + ", Year of birth: " + this.birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class FamilyTest {
    public static void main(String[] args) {
        FamilyMember father
                = new FamilyMember("Alexander", 1972);
        FamilyMember mother
                = new FamilyMember("Ekaterina", 1986);
        FamilyMember daughter
                = new FamilyMember("Anastasia", 2012);
        FamilyMember son
                = new FamilyMember("Konstantin", 2016);

        ArrayList<FamilyMember> family = new ArrayList<>();
        family.add(father);
        family.add(mother);
        family.add(daughter);
        family.add(son);
        System.out.println("All family members: " + family);

        printParents(family, d -> (d.getName().equals("Alexander")
                || d.getName().equals("Ekaterina")));
    }

    static void printParents(ArrayList<FamilyMember> family,
                             Predicate<FamilyMember> p) {
        System.out.println("\nParents are: ");
        for (FamilyMember member : family) {
            if (p.test(member))
                System.out.println(member.getName());
        }
    }
}
