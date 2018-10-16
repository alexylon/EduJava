package me.alexandroff.oca.simulator;

public class ConversionTest {
    public static void main(String[] args) {

        byte byteVar = 5; //8 bits
        char charVar = 'A'; // 16 bits
        short shortVar = 10; // 16 bits

        int intVar = 20; // 32 bits
        long longVar = 20; // 64 bits

        float floatVar = 20; // 32 bits
        double doubleVar = 20; // 64 bits

        doubleVar = byteVar;
        doubleVar = charVar;
        doubleVar = shortVar;
        doubleVar = intVar;
        doubleVar = longVar;
        doubleVar = floatVar;

        floatVar = byteVar;
        floatVar = charVar;
        floatVar = shortVar;
        floatVar = intVar;
        floatVar = longVar;
        floatVar = (float) doubleVar;

        longVar = byteVar;
        longVar = charVar;
        longVar = shortVar;
        longVar = intVar;
        longVar = (long) floatVar;
        longVar = (long) doubleVar;

        intVar = byteVar;
        intVar = charVar;
        intVar = shortVar;
        intVar = (int) longVar;
        intVar = (int) floatVar;
        intVar = (int) doubleVar;

        shortVar = byteVar;
        shortVar = (short) charVar; // !!!
        shortVar = (short) intVar;

        charVar = (char) byteVar; // !!!
        charVar = (char) shortVar;

        byteVar = (byte) charVar;
        byteVar = (byte) shortVar;
    }
}
