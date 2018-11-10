public class Door {

    boolean hasLock;
    String color;
    int hingesCount;

    public static void main(String[] args) {
        Door yellowDoor = new Door();
        yellowDoor.color = "Yellow";
        yellowDoor.hingesCount = 3;
        yellowDoor.hasLock = false;

        Door whiteDoor = new Door();
        whiteDoor.color = "White";
        whiteDoor.hingesCount = 2;
        whiteDoor.hasLock = true;

        System.out.println("Color=" + whiteDoor.color + " HingesCount=" + whiteDoor.hingesCount);

        System.out.println("Color=" + yellowDoor.color + " sHingesCount=" + yellowDoor.hingesCount);
    }
}