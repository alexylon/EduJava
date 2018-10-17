package me.alexandroff.oca.simulator;

abstract class AbstractE {
    String str = "Variable from AbstractE";

    abstract void printAbstract();

    void printSmth() {
        System.out.println("printSmth");
    }
}

class SubAbstractE extends AbstractE {
    String str = "Variable from SubAbstractE";

    void printAbstract() {
        System.out.println("Method from SubAbstractE");
    }
    //Abstract methods in non-abstract subclasses must be implemented
}

class testAbstract {
    public static void main(String[] args) {
    /*
        AbstractE ref1 = new AbstractE();
    */
        //Abstract classes cannot be instantiated

        AbstractE ref2 = new SubAbstractE();
        SubAbstractE ref3 = new SubAbstractE();

        ref2.printAbstract();
        ref3.printAbstract();
        System.out.println(ref2.str);
        System.out.println(((SubAbstractE) ref2).str);
        System.out.println(ref3.str);
    }
}

abstract class subTestAbstract extends testAbstract {
    //!!! An abstract class CAN extend a concrete class
}
