package me.alexandroff.oca.practice;

public class UnreachableForLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        int counter2 = 0;
        for (int value : arr) {
            if (value > -1) {
                arr[counter2] = value + 1;
            }
            counter2++;

            if (counter >= 5) {
                break;
            } else
                continue;
            /*
            counter++;
            */
            //Unreachable statement because of both 'break' and 'continue'

        }
        System.out.println(arr[counter]);
    }
}
