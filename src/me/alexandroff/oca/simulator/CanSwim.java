package me.alexandroff.oca.simulator;

import java.util.*;


public interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            CanSwim tadpole = amphibian;
            Amphibian tadpole2 = amphibian;
            Object tadpole3 = amphibian;
            Tadpole tadpole4 = (Tadpole) amphibian;
        }
    }
}
