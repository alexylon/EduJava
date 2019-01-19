package me.alexandroff.oca.practice;

public class Test24 {
    public static void main(String[] args) {

        Test24 t = new Test24();
        t.method(null);

        int[] arr = {1, 2, 3, 4};
        int count = 0;
        for (int e : arr) {
            if (count >= 5) {
                break;
            } else {
                continue;
            }
            //System.out.println("Katia");
            //Unreachable statement
        }
    }

    void method(java.io.IOException e) {
        System.out.println("IO");
    }

    void method(Object o) {
        System.out.println("Object");
    }
}
