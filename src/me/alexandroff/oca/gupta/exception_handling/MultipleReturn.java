package me.alexandroff.oca.gupta.exception_handling;

public class MultipleReturn {
    int getInt() {
        try {
            String[] students = {"Harry", "Paul"};
            System.out.println(students[5]);
        } catch (Exception e) {
            return 10;
        } finally {
            return 20;
        }

        //System.out.println("Next..."); - Won't compile - unreachable statement
    }

    public static void main(String args[]) {
        MultipleReturn var = new MultipleReturn();
        System.out.println(var.getInt()); // Prints the value of "finally"
    }
}
