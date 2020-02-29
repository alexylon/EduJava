package me.alexandroff.oca.practice;

public class TernaryTest {
    public static void main(String[] args) {
        String tiger = "Tiger";
        String lion = "Lion";
        // String result = 10 > 100 ? lion : tiger = "Timur";
        // NO, it is the same as String result = (10 > 100 ? lion : tiger) = "Timur";
        // but (10 > 100 ? lion : tiger) is not a variable

        String result = 10 > 100 ? lion : (tiger = "Timur"); // OK
        System.out.println(result);
    }
}
