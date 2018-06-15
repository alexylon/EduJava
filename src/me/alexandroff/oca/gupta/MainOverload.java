package me.alexandroff.oca.gupta;

public class MainOverload {

    public static void main(String args) {
        System.out.println("Hello exam 2");
    }

    public static void main(String args[]) {
        System.out.println("Hello exam");
        main(5);
    }

    public static void main(int number) {
        System.out.println("Hello exam 3: " + number);
    }
}
