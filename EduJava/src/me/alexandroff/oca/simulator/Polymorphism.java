package me.alexandroff.oca.simulator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Mamal {
    boolean hasTeeth() {
        return true;
    }
}

interface HasTail {
    boolean hasTail();
}

class Human extends Mamal implements HasTail {
    // class Human implements HasTail extends Mamal - NO
    public boolean hasTail() {
        return false;
    }

    int humanAge = 46;
}

class MamalTest {
    public static void main(String[] args) {
        Human human = new Human();
        Mamal mamal = human;
        HasTail tail = human;

        System.out.println(human.hasTeeth());
        System.out.println(human.hasTail());
        System.out.println(human.humanAge);

        System.out.println(mamal.hasTeeth());
        //System.out.println(mamal.hasTail()); - NO
        System.out.println(((Human) mamal).hasTail());
        System.out.println(((HasTail) mamal).hasTail());
        //System.out.println(mamal.humanAge); - NO
        System.out.println(((Human) mamal).humanAge);

        System.out.println(tail.hasTail());
        //System.out.println(tail.hasTeeth()); - NO
        System.out.println(((Human) tail).hasTeeth());
        //System.out.println(tail.humanAge); - NO
        System.out.println(((Human) tail).humanAge);
    }
}

//Here are some basic rules to keep in mind
// when casting variables:
//1. Casting an object from a subclass to
// a superclass doesn’t require an explicit cast.
//2. Casting an object from a superclass to
// a subclass requires an explicit cast.
//3. The compiler will not allow casts to unrelated types.
//4. Even when the code compiles without issue,
// an exception may be thrown at runtime if the object
// being cast is not actually an instance of that class.

// The third rule is important:
/*
public class Bird {}
public class Fish {
public static void main(String[] args) {
Fish fish = new Fish();
Bird bird = (Bird)fish; // DOES NOT COMPILE
}
}

OR

public class Rodent {
}
public class Capybara extends Rodent {
public static void main(String[] args) {
Rodent rodent = new Rodent();
Capybara capybara = (Capybara)rodent;
// Throws ClassCastException at runtime
}
}
This code creates an instance of Rodent and then
tries to cast it to a subclass of Rodent, Capybara.
 Although this code will compile without issue,
it will throw a ClassCastException at runtime since
the object being referenced is not an instance of the
Capybara class. The thing to keep in mind in this
example is the object that was created is not related
to the Capybara class in any way.

 */