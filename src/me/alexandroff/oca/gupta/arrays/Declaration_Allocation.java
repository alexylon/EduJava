package me.alexandroff.oca.gupta.arrays;

public class Declaration_Allocation {

    public static void main(String[] args) {

        int[] intArray1;
        int intArray2[];
        //!!! int intArray3[6]; Won't compile. Cannot be allocated without "new"

        int[] intArray3 = new int[6];
        //!!! int[] intArra4 = new int[]; Won't compile. Must be allocated after "new"

        int[] multiArray2[]; // !!! 2D array;
        multiArray2 = new int[2][3];
        int[][] multiArray1 = new int[2][3];

        int[][] multD = new int[3][]; // OK!!!
        multD[0] = new int[3];
        multD[1] = new int[2];
        multD[2] = new int[5];
        // OR int[][] multD = {{2, 4, 1}, {6, 8}, {7, 3, 6, 5, 1}};

        // int[][] multiArray3 = new int[][3]; Won't compile. Not OK
        // int[][] multiArray4 = new int[5]; Won't compile
        // int[] intArray9 = new int[5.0]; Won't compile. Size can be only "int"
        // double[] doubleArray1 = new double[5.2]; Won't compile. Size can be only "int"
        int[] intArray10 = new int[2 * 5]; // OK!!!
        int[] multiArray5[] = new int[5][10]; // !!! 2D array;
        int[][] array2 = new int[][] {{1, 2, 3}, {}, {1, 2,3, 4, 5}}; // !!! OK
        int[][] array3 = {{1, 2, 3}, {}, {1, 2,3, 4, 5}};
    }
}
