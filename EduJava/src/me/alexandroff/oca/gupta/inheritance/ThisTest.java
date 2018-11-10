package me.alexandroff.oca.gupta.inheritance;

public class ThisTest {

    String name;
    String address;

    ThisTest() {
        this.name = "NoName";
        this.address = "NoAddress";
    }

    ThisTest(String name, String address) {
        this();
        // Calling a constructor must be the FIRST line
        if (name != null) this.name = name;
        if (address != null) this.address = address;
    }

    public String toString() {

        return "Name: " + this.name
                + "\nAddress: " + this.address + "\n";
    }
}

class RunThisTest {

    public static void main(String[] args) {
        ThisTest person1
                = new ThisTest("Alexander", "Lyulin-2");
        ThisTest person2
                = new ThisTest("Vania", "Mara Dencheva");
        ThisTest person3
                = new ThisTest(null, null);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
