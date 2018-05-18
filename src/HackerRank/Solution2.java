package HackerRank;

public class Solution2 {

    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zer = 0;
        int a = arr.length;

        for (int i=0; i<a; i++) {
            if (arr[i] >0) {pos++;}
            if (arr[i] <0) {neg++;}
            if (arr[i] ==0) {zer++;}
        }

        double fracPos = ((double)pos / (double)a);
        double fracNeg = ((double)neg / (double)a);
        double fracZer = ((double)zer / (double)a);

        System.out.println(fracPos);
        System.out.println(fracNeg);
        System.out.println(fracZer);
    }

    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);

    }
}
