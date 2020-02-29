package me.alexandroff.oca.practice;

public class SwitchTest {
    public static void main(String[] args) {
        int x = 10;

        switch (x % 4) {
            case (0):
                System.out.println("Divisible by 4");
                break;
            default:
                System.out.println("Not divisible by 4");


        }
    }
}
