package me.alexandroff.oca.practice;

public class ArrayTest {
    public static void main(String[] args) {
        //String[] arrStr = {1, 2, 3};
        // NO ints to String

        int[] intArr;
        //intArr = {1, 2, 3};
        // Array initializer is NOT allowed in this way

        args[0] = "Alex";
        //ArrayIndexOutOfBoundsException. 'args' is with length 0
        args[1] = "Katia";

        for (String str : args) {
            System.out.println(str);
        }


    }
}
