package me.alexandroff.oca.gupta.flow_control;

public class For_Loop_Test {

    public static void main(String[] args) {

        StringBuilder myArr2[] = {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
        };
        for (StringBuilder val : myArr2)
            System.out.println(val);
        for (int i = 0; i < myArr2.length; i++)
            myArr2[i] = new StringBuilder("Oracle");
        // the array variables are assigned new values,
        // but this CHANGES the objects in the array
        for (StringBuilder val : myArr2)
            System.out.println(val);
    }
}
