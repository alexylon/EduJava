package me.alexandroff.oca.gupta.exception_handling;

import java.util.ArrayList;

class Ink {
}

class ColorInk extends Ink {
}

class BlackInk extends Ink {
}

public class ClassCastExceptionTest {
    public static void main(String[] args) {
        ArrayList<Ink> inks = new ArrayList<>();
        inks.add(new ColorInk());
        inks.add(new BlackInk());

        Ink ink = (BlackInk) inks.get(0);
        //Throws ClassCastException because
        //an object of type ColorInk CANNOT be cast to object of type BlackInk
    }
}

class ClassCastExceptionTest2 {
    public static void main(String[] args) {
        ArrayList<ColorInk> inks = new ArrayList<>();
        inks.add(new ColorInk());

        //Ink ink = (BlackInk) inks.get(0); - Fails to compile because
        //ArrayList is of type ColorInk and CANNOT be cast to BlackInk

    }
}

class ClassCastExceptionTest3 {
    //THE RIGHT WAY...
    //You can use the instanceof operator to verify whether an object
    //can be cast to another class before casting it

    public static void main(String[] args) {
        ArrayList<Ink> inks = new ArrayList<>();
        inks.add(new ColorInk());
        inks.add(new BlackInk());

        if (inks.get(0) instanceof BlackInk) {
            BlackInk ink = (BlackInk) inks.get(0);
        }
    }
}

