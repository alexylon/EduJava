package me.alexandroff.oca.gupta.flow_control;

public class Labeled_Statements {

    public static void main(String[] args) {

        //■ A code block defined using {}
        //■ All looping statements (for, enhanced for, while, do-while)
        //■ Conditional constructs (if and switch statements)
        //■ Expressions
        //■ Assignments
        //■ return statements
        //■ try blocks
        //■ throws statements

        int[][] ints = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        for (int[] arr2 : ints) {
            for (int element : arr2) {
                System.out.print(element + " ");
            }
        }

        System.out.println();

        for (int[] arr2 : ints) {
            for (int element : arr2) {
                if (element % 2 == 0) continue;
                System.out.print(element + " ");
            }
        }

        System.out.println();

        outer:
        for (int[] arr2 : ints) {
            for (int element : arr2) {
                if (element % 2 == 0) continue outer;
                System.out.print(element + " ");
            }
        }
    }
}
