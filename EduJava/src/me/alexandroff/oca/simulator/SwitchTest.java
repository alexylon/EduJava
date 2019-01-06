package me.alexandroff.oca.simulator;

public class SwitchTest {
    public static void main(String[] args)
    {
        int x = 10;

        switch(x % 4) {
            default: System.out.println("Not divisible by 4");
            case(0): System.out.println("Divisible by 4");
        }
    }
}
