package me.alexandroff.oca.gupta.inheritance;

public class BaseClass {

    int a = 5;
    int b = 7;
    String name;

    BaseClass(String name) {
        this.name = name;
    }


}

class ChildClass1 extends BaseClass {
    int a = 6;
    int b = 8;

    String name;

    ChildClass1(String name) {
        super(name);
        //Cannot be omited
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

        BaseClass baseClass
                = new BaseClass("Alexander");
        BaseClass baseChildClass
                = new ChildClass1("Ekaterina");
        ChildClass1 childClass1
                = new ChildClass1("Anastasia");

        System.out.println(baseClass.name);
        System.out.println(baseChildClass.name);
        System.out.println(childClass1.name);

        System.out.println();

        childClass1.testPrint();
    }
}
