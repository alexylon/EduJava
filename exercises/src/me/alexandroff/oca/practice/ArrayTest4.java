package me.alexandroff.oca.practice;

public class ArrayTest4 {
    public static void main(String[] args) {
        Object[] obj[] = {{" string is also an object"},
                {null}, //!!! length 1
                {new Object(), new Integer(10)}};

        for (int i = 0; i < obj.length; i++) {
            System.out.println("The length of obj[" + i + "] is: " + obj[i].length);
        }

    }
}
