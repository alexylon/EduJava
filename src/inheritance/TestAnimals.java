package inheritance;

public class TestAnimals {

    public static void main(String[] args) {

        Animal dog1 = new Dog("Bulldog");

        System.out.println(dog1);

        dog1.eat();
        dog1.walk();
    }
}
