package me.alexandroff.oca.practice;

public class ForTest {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0; i < 4 && j < 3; ++i) {
            ++j;
            System.out.println(i + j);
        }
    }
}
