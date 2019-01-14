package me.alexandroff.oca.practice;

public class ConversionTest {
    public static void main(String[] args) {

        byte byteVar = 5; //8 bits
        char charVar = 5; // 16 bits
        short shortVar = 5; // 16 bits

        int intVar = 5; // 32 bits
        final int INTVAR = 5;
        long longVar = 5; // 64 bits

        float floatVar = 5; // 32 bits
        double doubleVar = 5; // 64 bits

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
        shortVar = INTVAR;
        // !!!
        //Implicit narrowing occurs only for
        // 'final' byte, char, short, and int

        charVar = (char) byteVar; // !!!
        charVar = (char) shortVar;
        charVar = INTVAR;
        //Implicit narrowing occurs only for
        // 'final' byte, char, short, and int

        byteVar = (byte) charVar;
        byteVar = (byte) shortVar;
        byteVar = INTVAR;
        //Implicit narrowing occurs only for
        // 'final' byte, char, short, and int

        float value1 = 102;
        float value2 = (int) 102.0;
        //float value3 = 1f * 0.0;
        // Incompatible types, '0.0' is 'double'
        float value4 = 1f * (short) 0.0;
        //float value5 = 1f * (boolean)0; - Incompatible types
        //short value6 = shortVar * 2;
        //'value6' becomes 'int'
    }
}
