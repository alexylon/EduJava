package me.alexandroff.oca.simulator;

public class EqualityTest {
    public static void main(String[] args) {
        byte byteVar = 5; //8 bits
        char charVar = 5; // 16 bits
        short shortVar = 5; // 16 bits

        int intVar = 5; // 32 bits
        final int INTVAR = 5;
        long longVar = 5; // 64 bits

        float floatVar = 5; // 32 bits
        double doubleVar = 5; // 64 bits

        System.out.println(byteVar == doubleVar); // true
        System.out.println(charVar == floatVar); // true
        //System.out.println(byteVar.equals(doubleVar));
        //DOES NOT COMPILE

        String str = null;
        int integ = 0;
        //System.out.println(str == integ);
        //DOES NOT COMPILE

    }
}
