package me.alexandroff.maxplus.threads;

public class TestRunnable implements Runnable {

    public void run() {
        System.out.println("Hello Runnable");
    }

    public static void main(String[] args) {
        (new Thread(new TestRunnable())).start();
    }
}
