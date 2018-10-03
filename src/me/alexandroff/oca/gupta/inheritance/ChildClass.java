package me.alexandroff.oca.gupta.inheritance;

public class ChildClass implements Interface1, Interface2 {
    // Methods with the same names in "parent" interfaces
    // must be overridable.
    // Their parameters must differ

    @Override
    public int getName(int a) {
        return 0;
    }

    @Override
    public String getName(String a) {
        return null;
    }

    @Override
    public void sayName() {

    }
}

interface Interface1 {

    int getName(int a);

    default void sayName() {
        System.out.println("Alex");
    }
}

interface Interface2 {

    String getName(String a);

    default void sayName() {
        System.out.println("Katia");
    }
}
