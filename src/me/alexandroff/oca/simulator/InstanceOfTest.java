package me.alexandroff.oca.simulator;

interface InstanceOfTest {
}

class SubClass01 implements InstanceOfTest {
}

class SubClass02 {
}

class TestClass01 {
    public static void main(String[] args) {
        InstanceOfTest obj1 = new SubClass01();
        SubClass01 obj2 = new SubClass01();
        SubClass02 obj3 = new SubClass02();

        System.out.println(obj1 instanceof InstanceOfTest);
        System.out.println(obj1 instanceof SubClass01);
        System.out.println(obj2 instanceof InstanceOfTest);
        System.out.println(obj2 instanceof SubClass01);
        System.out.println(obj3 instanceof InstanceOfTest);
    }
}
