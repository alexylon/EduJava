package me.alexandroff.oca.gupta;

public class MethodParameters {


    static float calcAverage(int a, int b) {
        int d;
        float avg = (a + b) / 2.0f;
        return avg;

    }

    static double calcAverage2(int a, int b) {
        double avg = (a + b) / 2.0;
        return avg;
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
        
    }

    public static void main(String[] args) {
        int a = 5, b = 10;

        float avg = calcAverage(a, b);
        double avg2 = calcAverage2(a, b);


        System.out.println("The average of " + a
                + " and " + b + " is " + avg);

        System.out.println("The average of " + a
                + " and " + b + " is " + avg2);
    }
}
