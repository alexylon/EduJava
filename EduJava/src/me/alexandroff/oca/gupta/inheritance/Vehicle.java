package me.alexandroff.oca.gupta.inheritance;

public class Vehicle {

    private String producer;
    private int maxSpeed;

    Vehicle(String producer, int maxSpeed) {
        this.producer = producer;
        this.maxSpeed = maxSpeed;
    }

    void turnRight() {

        System.out.println(this.producer + " turns right");
    }

    public String toString() {
        return "Producer: " + this.producer +
                "\nMax speed: " + this.maxSpeed;
    }

    void setProducer(String producer) {

        this.producer = producer;
    }

    String getProducer() {

        return this.producer;
    }
}

class Car extends Vehicle {

    String type;

    public Car(String producer, int maxSpeed) {

        super(producer, maxSpeed);
    }

    public Car(String producer, int maxSpeed, String type) {
        super(producer, maxSpeed);
        this.type = type;
    }
}

class Truck extends Vehicle {

    public Truck(String producer, int maxSpeed) {

        super(producer, maxSpeed);
    }
}

class TestVehicle {

    public static void main(String[] args) {

        Vehicle car1
                = new Car("Renault", 220, "Hatchback");
        Vehicle truck1
                = new Truck("Mercedes", 160);

        truck1.turnRight();
        System.out.println(truck1);
        System.out.println();
        System.out.println("My car is " + car1.getProducer());

    }
}
