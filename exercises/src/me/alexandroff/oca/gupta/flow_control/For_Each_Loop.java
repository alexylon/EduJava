package me.alexandroff.oca.gupta.flow_control;

public class For_Each_Loop {

    public static void main(String[] args) {

        //■ The enhanced for loop can’t be used to initialize
        // an array and modify its elements.
        //■ The enhanced for loop can’t be used to delete
        // the elements of a collection.
        //■ The enhanced for loop can’t be used to iterate
        // over multiple collections or arrays in the same loop.

        StringBuilder myArr[] = {
                new StringBuilder("Java"),
                new StringBuilder("Loop")
        };
        for (StringBuilder val : myArr)
            System.out.println(val);

        System.out.println();

        for (StringBuilder val : myArr)
            val.append("Oracle");
        for (StringBuilder val : myArr)
            System.out.println(val);
        // !!! If the value of the loop variable
        //is manipulated by executing METHODS on it,
        // the modified value will be reflected in the
        //collection of objects being iterated

        System.out.println();

        StringBuilder myArr2[] = {
                new StringBuilder("Swift"),
                new StringBuilder("Infinite")
        };
        for (StringBuilder val : myArr2)
            System.out.println(val);
        for (StringBuilder val : myArr2)
            val = new StringBuilder("Apple");
        // the *loop variable* is assigned a value,
        // but this DOESN'T change the objects in the array
        for (StringBuilder val : myArr2)
            System.out.println(val);
        System.out.println();

        StringBuilder myArr3[] = {
                new StringBuilder("Python"),
                new StringBuilder("Cycle")
        };
        for (StringBuilder val : myArr3)
            System.out.println(val);
        for (int i = 0; i < myArr3.length; i++)
            myArr3[i] = new StringBuilder("Guido");
        // the *array variables* are assigned new values,
        // but the "for loop" CHANGES the objects in the array
        for (StringBuilder val : myArr3)
            System.out.println(val);
        System.out.println();

        // The collection of primitives cannot be changed by "for each"
        int[] ints = {0, 1, 2, 3};
        for (int e : ints) {
            e++;
        }
        for (int e : ints) {
            System.out.println(e);
        }
        System.out.println();

        // The collection of primitives CAN be changed by a "for loop"
        int[] ints2 = {0, 1, 2, 3};
        for (int i = 0; i < ints2.length; i++) {
            ints2[i]++;
        }
        for (int e : ints2) {
            System.out.println(e);
        }
    }
}