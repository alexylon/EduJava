package me.alexandroff.oca.gupta.inheritance;

// The reference variable super can also be used
// to refer to the constructors of the base
//class in a derived class.

public class Employee3 {

    String name;
    String address;

    Employee3(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Programmer3 extends Employee3 {
    String progLanguage;

    Programmer3(String name, String address, String progLang) {
        super(name, address); // OR super("alex", "lyulin");
        // A call to a superclass’s constructor
        // must be the first statement
        //  in a derived class’s constructor.
        this.progLanguage = progLang;

    }

    void printGreeting() {
        System.out.println("Hello Programmer");
    }
}

class TestEmployee3 {

    public static void main(String[] args) {

        Employee3 emp
                = new Employee3("Vania", "Mara Dencheva");
        Employee3 prog
                = new Programmer3("Alexander", "Lyulin-2",
                "Java");

        System.out.println("Name emp: " + emp.name +
                "; Address emp: " + emp.address);
        System.out.println("Name prog: " + prog.name +
                "; Address prog: " + prog.address + "; progLang prog: "
                + ((Programmer3) prog).progLanguage); // !!!

        // ((Programmer3) emp).printGreeting();
        // - Throws exception
        ((Programmer3) prog).printGreeting();
    }
}


