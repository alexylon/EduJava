package HackerRank;

public class Starecase {

    public static void main(String[] args) {

        int n = 6;
        int x = 1;
        int y = n;

        for (int k = 0; k < n; k++) {

            for (int i = 1; i < y; i++) {
                System.out.print(" ");
            }
            y--;

            for (int j = 0; j < x; j++) {
                System.out.print("#");
            }
            x++;
            System.out.println();
        }
    }
}
