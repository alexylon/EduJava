package me.alexandroff.oca.gupta.inheritance;

public class BaseClass {

    int a;
    int b;
    String name;

    BaseClass(String name) {
        this.name = name;
    }


}

class ChildClass1 extends BaseClass {

    String name;

    ChildClass1(String name) {
        super(name);
    }


    void testPrint() {

        int c = this.a + this.b;
        int d = super.a + super.b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String... aaa) {

        BaseClass baseClass = new BaseClass("Alexander");
        BaseClass baseChildClass = new ChildClass1("Ekaterina");
        ChildClass1 childClass1 = new ChildClass1("Anastasia");

        System.out.println(baseClass.name);
        System.out.println(baseChildClass.name);
        System.out.println(childClass1.name);
    }
}
