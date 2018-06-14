package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestThread extends Thread {

    public void run() {
        System.out.println("Hello Thread");
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Name :" + Thread.currentThread().getName());
                System.out.println("State :" + Thread.currentThread().getState());
                System.out.println("Priority :" + Thread.currentThread().getPriority());
                System.out.println("Is daemon :" + Thread.currentThread().isDaemon());
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, "It is interrupted", ex);
            }
        }
    }
}
