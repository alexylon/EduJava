package me.alexandroff.oca.gupta.flow_control;

public class For_Each_Limitations {

    public static void main(String[] args) {

        // Use the for-each loop to iterate over arrays and collections.
        // !!! Don’t use it to initialize, modify, or filter them

        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; ++i) {
            myArray[i] = i;
            if ((myArray[i] % 2) == 0)
                myArray[i] = 20;
        }

        for (int val : myArray)
            System.out.println(val);
    }
}
