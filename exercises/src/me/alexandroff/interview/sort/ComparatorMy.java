package me.alexandroff.interview.sort;

import java.util.*;

class Family {
    private String name;
    private int age;

    Family(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + " : " + this.age;
    }
}

class SortByAge implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {

        return o1.getAge() - o2.getAge();
    }
}

class SortByName implements Comparator<Family> {
    @Override
    public int compare(Family o1, Family o2) {

        return o1.getName().compareTo(o2.getName());
    }
}

class sortFamily {
    public static void main(String[] args) {
        Family member1 = new Family("Alexander", 46);
        Family member2 = new Family("Ekaterina", 32);
        Family member3 = new Family("Anastasia", 6);
        Family member4 = new Family("Konstantin", 2);

        List<Family> family = new ArrayList<>();
        family.add(member1);
        family.add(member2);
        family.add(member3);
        family.add(member4);

        System.out.println("Unsorted: " + family);

        Collections.sort(family, new SortByName());
        System.out.println("By name : " + family);

        Collections.sort(family, new SortByAge());
        System.out.println("By age  : " + family);
    }
}
