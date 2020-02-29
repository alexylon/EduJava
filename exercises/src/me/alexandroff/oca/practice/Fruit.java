package me.alexandroff.oca.practice;

abstract class Fruit { // must be declared abstract because it has an abstract method
    abstract void consume();

    static String color() {
        return "No color";
    }
}

class Apple extends Fruit {
    void consume() {
        System.out.println(" Consuming Apple...");
    }

    static String color() {
        return "Green color";
    }
}

class Orange extends Fruit {
    void consume() {
        System.out.println(" Consuming Orange...");
    }

    static String color() {
        return "Orange color";
    }
}

class Person1 {
    void eatFruit(Fruit f) {
        f.consume();
    }
}

class TestFruit {
    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();
        Fruit af = new Apple();
        Fruit of = new Orange();
        Person1 p = new Person1();
        p.eatFruit(a);//Consuming Apple...
        p.eatFruit(o);//Consuming Orange...
        af.consume();//Consuming Apple...
        of.consume();//Consuming Orange...
        System.out.println(a.color());//Green color
        System.out.println(o.color());//Orange color
        System.out.println(af.color());//No color
        System.out.println(of.color());//No color
        System.out.println(((Apple) af).color());//Green color
        System.out.println(((Orange) of).color());//Orange color
        System.out.println(of instanceof Fruit);//true
        System.out.println(of instanceof Orange);//true
        System.out.println(of instanceof Apple);//false


        af = a;
        //apple is a fruit
        a = (Apple) af;
        //OK, we declare that this fruit is of type apple,
        //and indeed - apple is-a fruit of type apple
        a = (Apple) of;
        //We fooled the compiler, but at runtime throws
        //ClassCastException since apple is-not a fruit of type orange

        /* DOES NOT COMPILE:
        o = a;
        //orange is not apple
        a = af; //!!!
        //Not all apples are fruits
        */
    }
}


