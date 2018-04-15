package my;

import java.math.BigDecimal;

public class Lecture2 {

    public static void main(String[] args) {

        byte a = 10;
        int b = 50;
        long l = 500;

        int result = (int) (a + b + l);

        System.out.println("maxplus= " + result);


        float balance = 0.5f;
        float sum = 0.6f + 0.1f;
        float result2 = 0.7f;
        System.out.println(sum);
        System.out.println("equal = " + (sum == result2));
        System.out.println(result);


        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.6");

        //sBigDecimal sum = first.add(second);

    }
}
