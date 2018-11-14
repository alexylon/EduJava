package me.alexandroff.oca.simulator;

import java.util.*;

public class FinalReference {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(5); // OK
        // list = new ArrayList<>(); DOES NOT COMPILE
        // We are allowed to call methods
        // on final reference variables. All the compiler can do is
        // check that we don’t try to reassign the
        // final values to point to a different object.
    }
}
