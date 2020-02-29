package me.alexandroff.oca.practice;

public class Test23 {
    public static void main(String[] args) {
        String fullPhoneNumber = "359-889-5076";
        String xx = new StringBuilder("xxx-xxx-")
                + fullPhoneNumber.substring(8);
        System.out.println(xx);

        String hello = "Hello ";
        StringBuilder world = new StringBuilder("world");
        String helloWorld = hello + world;
        System.out.println(helloWorld);
    }
}
