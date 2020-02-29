package me.alexandroff.oca.practice;

public class ExceptionTest4 {
    public static void main(String[] args) {
        ExceptionTest4 et = new ExceptionTest4();
        et.doInterest();
    }

    public double computeSimpleInterest(double p, double r, double t) {
        if (t < 0) throw new IllegalArgumentException(" time is less than 0");
        return p * r * t / 100;
    }

    public void doInterest() {
        try {
            double interest = computeSimpleInterest(1000.0, 10.0, -1);
            System.out.println(" Computed interest " + interest);
        } catch (IllegalArgumentException iae) {
            System.out.println(" Problem in computing interest:" + iae.getMessage());
            iae.printStackTrace();
        } finally {
            System.out.println(" all done");
        }
    }

}
