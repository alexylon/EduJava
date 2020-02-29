package me.alexandroff.misc.animals;

public class Home {
    public static void main(String[] args) {
        Animal[] cats = new Cat[2];
        cats[0] = new Cat("Ludwig", 4);
        cats[1] = new Cat("Gioia", 10);
        Animal[] dogs = {new Dog("Jerry", 5),
                new Dog("Sharo", 12)};

        System.out.println(cats[0]);
        System.out.println(dogs[0]);
        System.out.println(cats[1].getName());
        System.out.println();
        System.out.println(dogs[0].str);
        dogs[0].method1();
    }
}
