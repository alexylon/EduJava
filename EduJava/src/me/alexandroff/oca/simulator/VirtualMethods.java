package me.alexandroff.oca.simulator;

class Birds {
    int age = 0;

    public String getName() {
        return "Unknown";
    }

    void birdInformation() {
        System.out.println("The bird's specie is: " + getName() + " " + age);
    }
}

class Peacock extends Birds {
    int age = 2;

    public String getName() {
        return "Peacock";
    }
}

class Owl extends Birds {
    int age = 4;

    public String getName() {
        return "Owl";
    }
}

class BirdsTest {
    public static void main(String[] args) {
        Birds peacock = new Peacock();
        Birds owl = new Owl();
        peacock.birdInformation();
        // The bird's specie is: Peacock 0
        owl.birdInformation();
        // The bird's specie is: Owl 0
        System.out.println("The age of the " + peacock.getName()
                + " is " + peacock.age);
        // The age of the Peacock is 0
        System.out.println("The age of the " + owl.getName()
                + " is " + owl.age);
        // The age of the Owl is 0
        System.out.println("The age of the " + peacock.getName()
                + " is " + ((Peacock) peacock).age);
        // The age of the Peacock is 2
        System.out.println("The age of the " + owl.getName()
                + " is " + ((Owl) owl).age);
        // The age of the Owl is 4
    }
}
