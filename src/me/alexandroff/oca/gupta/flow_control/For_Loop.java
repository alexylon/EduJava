package me.alexandroff.oca.gupta.flow_control;

public class For_Loop {

    public static void main(String[] args) {

        // The initialization section, which executes only once,
        // may define **multiple initialization statements**,
        // but the variables it declares should be of the same type.
        // Similarly, the update clause may define **multiple statements**.
        // But there can be **only ONE termination condition** for a "for" loop.

        int a = 10;
        for (int b = 20, c = 30; b < c; b++, --c, a = a + 1) { // "b" and "c" must be of ONE type
            System.out.println(a + " : " + b + " : " + c);
        }
        System.out.println();

        // System.out.println(b); - Won't compile, "b" out of scope

        long n = 10;
        for (int b = 1; n < 15; n++) { // "n" and "b" are of different type
            System.out.println(++b);
        }
        System.out.println();

        int t = 1;
        for (; t < 3; t++) { // !!! The two ";" are obligatory
            System.out.println("Missing initialization block");
        }
        System.out.println();

        for (int i = 1; ; i++) { // !!! The two "; ;" are obligatory
            System.out.println("Missing termination condition");
            if (i > 3) {
                break;
            }
        }
        System.out.println();

        for (int i = 1; i < 3; ) { // !!! Again, the two ";" are obligatory
            i++;
            System.out.println("Missing update clause");
        }
        System.out.println();

        int k = 1;
        for (; ; ) {
            k++;
            if (k > 3) {
                break;
            }
            System.out.println("Missing ALL three parts");
        }
        System.out.println();

        for (int i = 1; i < 5; i++, printHello()) { // Increments AND calls a method in the update block
            System.out.println(i);
        }
        System.out.println();
    }

    static void printHello() {
        System.out.println("Hello");
    }
}
