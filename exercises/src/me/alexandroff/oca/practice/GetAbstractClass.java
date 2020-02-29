package me.alexandroff.oca.practice;

abstract class AbstractE {
    String str = "Variable from AbstractE";

    abstract void printAbstract();
    //identifier 'abstract' is mandatory if there's no body in an abstract class

    void printSmth() {
        System.out.println("printSmth");
    }
}

class SubAbstractE extends AbstractE {
    String str = "Variable from SubAbstractE";

    void printAbstract() {
        System.out.println("Method from SubAbstractE");
    }
    //Abstract methods in non-abstract subclasses must be overriden
    //They must NOT have more restrited access

    void printSmth() {
        System.out.println("printOther");
    }
    //All overriden methods must NOT have more restrited access
    //and may NOT throw an exception if the previous method does not
    //they can throw the same exception or a sub-exception, but not super-exception

    private void printSmth(String str) throws Exception {
        System.out.println("printOther");
    }
    //But instead, overloaded methods MAY have more restrited access
    //and MAY throw an exception even if the first class does not
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

abstract class subTestAbstract extends SubAbstractE {
    //!!! An abstract class CAN extend a concrete class

    abstract void printAbstract();
    //A concrete method can be overriden by an abstract method
}
