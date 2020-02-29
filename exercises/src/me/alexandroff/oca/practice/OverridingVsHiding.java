package me.alexandroff.oca.practice;

class AnimalKingdom {
    static String getStatic() {
        return "Parent";
    }

    void getInstance() {
        System.out.println("From parent : " + getStatic());
    }
}

class Horse extends AnimalKingdom {
    static String getStatic() {
        return "Child";
    }

    void getInstance() {
        System.out.println("From child : " + getStatic());
    }
}

class AnimalTest {
    public static void main(String[] args) {
        AnimalKingdom joey1 = new Horse();
        Horse joey2 = new Horse();
        AnimalKingdom joey3 = new AnimalKingdom();
        joey1.getInstance();
        joey2.getInstance();
        joey3.getInstance();
        System.out.println();
        System.out.println(joey1.getStatic());
        System.out.println(joey2.getStatic());
        System.out.println(joey3.getStatic());
    }
}
