package me.alexandroff.oca.gupta.inheritance;

public class ChildClass implements Interface1, Interface2 {
    // Methods with the same names in "parent" interfaces
    // must be overridable.
    // Their parameters must differ

    @Override
    public int getName(int a) {
        return 7;
    }

    @Override
    public String getName(String a) {
        return "seven";
    }

    @Override
    public void sayName() {
        System.out.println("ChildClass");
    }
}

interface Interface1 {

    int getName(int a);

    default void sayName() {
        System.out.println("Interface1");
    }
}

interface Interface2 {

    String getName(String a);

    default void sayName() {
        System.out.println("Interface2");
    }
}

class TestInterfaces {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        Interface1 interface1 = new ChildClass();
        Interface2 interface2 = new ChildClass();
        childClass.sayName();
        interface1.sayName();
        interface2.sayName();
        System.out.println();

        System.out.println(childClass.getName(1));
        System.out.println(childClass.getName("one"));

        System.out.println(interface1.getName(2));
        // Refference variable cannot be "interface2"
        System.out.println(interface2.getName("two"));
        // Refference variable cannot be "interface1"
    }
}



