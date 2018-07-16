package me.alexandroff.oca.gupta.flow_control;

public class Ternary_Construct_Nested {

    public static void main(String[] args) {

        // Code 1
        int bill = 200;
        int qty = 10;
        int discount = (bill > 1000) ? (qty > 11) ? 10 : 9 : 5;
        System.out.println(discount);

        // Code 1 with better indentation
        int bill2 = 200;
        int qty2 = 10;
        int discount2 = (bill2 > 1000) ?
                (qty2 > 11) ?
                        10 :
                        9 :
                5;
        System.out.println(discount2);

        // Code 2
        int bill3 = 2000;
        int qty3 = 10;
        int days3 = 10;
        int discount3 = (bill3 > 1000) ? (qty3 > 11) ? 10 : days3 > 9 ? 20 : 30 : 5;
        System.out.println(discount3);

        // Code 2 with better indentation
        int bill4 = 2000;
        int qty4 = 10;
        int days4 = 10;
        int discount4 = (bill4 > 1000) ?
                (qty4 > 11) ? 10 :
                        days4 > 9 ? 20 : 30 :
                5;
        System.out.println(discount4);

        // Code 2, but second "if" is inversed
        int bill5 = 2000;
        int qty5 = 10;
        int days5 = 10;
        int discount5 = (bill5 > 1000) ?
                (qty5 <= 11) ?
                        days5 > 9 ? 20 : 30 :
                        10 :
                5;
        System.out.println(discount5);

        // Code 2, but first and second "if" are inversed
        int bill6 = 2000;
        int qty6 = 10;
        int days6 = 10;
        int discount6 = (bill6 <= 1000) ? 5 :
                (qty6 <= 11) ?
                        days6 > 9 ? 20 : 30 :
                        10;
        System.out.println(discount6);

        // Code 2, but first "if" is inversed
        int bill7 = 2000;
        int qty7 = 10;
        int days7 = 10;
        int discount7 = (bill7 <= 1000) ? 5 :
                (qty7 > 11) ? 10 :
                        days7 > 9 ? 20 : 30;
        System.out.println(discount7);
    }
}
