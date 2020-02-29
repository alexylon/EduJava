package me.alexandroff.oca.gupta;

public class LogicalOperators {

    public static void main(String[] args) {
        int int1 = 5;
        double double1 = 5.0;
        long long1 = 5l;
        float float1 = 5.0f;
        char char1 = '5';
        char char2 = 'a';

        System.out.println(int1 == double1
                && int1 == long1 && int1 == float1);
        System.out.println(int1 == char1);
        System.out.println(char1 + ", " + char2);
    }
}
