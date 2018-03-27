package Exercises_1_7;

public class Exercise10 {

    public static void main(String[] args) {

        int[] intArray = {2, 4, 2, 8, 4};

        int i = 0;


        while (i < intArray.length) {
            for (int j = (i - 1); j >= 0; j--) {

                if (intArray[i] == intArray[j]) {
                    System.out.println("Output: " + intArray[i]);
                }
            }
            i++;
        }
    }
}