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

/* Infinite loop
        for (int i = 0; i < 10; ) {
            i = i++;
            System.out.println("Hello World");
        }
        */

        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);

    }
}
