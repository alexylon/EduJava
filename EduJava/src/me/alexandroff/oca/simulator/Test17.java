package me.alexandroff.oca.simulator;

public class Test17 {
    static Test17 ref;
    String[] arguments;

    public static void main(String args[]) {
        ref = new Test17();
        ref.func(args);


    }

    public void func(String[] args) {
        ref.arguments = args;
    }
}
