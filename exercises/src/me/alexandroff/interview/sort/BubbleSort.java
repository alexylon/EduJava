package me.alexandroff.interview.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {5, 3, 6, 4, 2, 1};
        boolean numberSwitched;
        do {
            numberSwitched = false;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i + 1] < ints[i]) {
                    int tmp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = tmp;
                    numberSwitched = true;
                }
            }
        } while (numberSwitched);

        for (int el : ints) {
            System.out.println(el);
        }
    }
}
