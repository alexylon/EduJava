package me.alexandroff.oca.practice;

public class Doll {
    String name;
    Doll(String nm) {
        this.name = nm;
    }

    class Barbie extends Doll {
        Barbie() {
            this("unknown");
        }

        Barbie(String nm) {
            super(nm);
        }
    }
}
