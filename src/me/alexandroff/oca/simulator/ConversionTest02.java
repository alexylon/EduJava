package me.alexandroff.oca.simulator;

// !!!
public class ConversionTest02 {
    public static void main(String[] args) {

        short x = 10;
        short y = 3;
        // short z = x * y;
        // DOES NOT COMPILE, x * y is converted to int
        short z = (short) (x * y);
        // OK

        long x1 = 10;
        int y1 = 5;
        // y1 = y1 * x1;
        // DOES NOT COMPILE
        // This last line could be fi xed with an explicit cast to (int),
        // but there’s a better way using the
        // compound assignment operator:
        y1 *= x1;
        // The compound operator will fi rst cast x to a long,
        // apply the multiplication of two long
        // values, and then cast the result to an int.
        x1 = x1 * y1; // OK because x1 is a long
    }
}
