package me.alexandroff.oca.gupta.flow_control;

public class Ternary_Construct_Nested {

    public static void main(String[] args) {

        int bill = 200;
        int qty = 10;
        int discount = (bill > 1000) ? (qty > 11) ? 10 : 9 : 5;
        System.out.println(discount);

        // The same code but with better indentation
        int bill2 = 200;
        int qty2 = 10;
        int discount2 = (bill2 > 1000) ?
                (qty2 > 11) ?
                        10 :
                        9 :
                5;
        System.out.println(discount2);

        int bill3 = 2000;
        int qty3 = 10;
        int days3 = 10;
        int discount3 = (bill3 > 1000) ? (qty3 > 11) ? 10 : days3 > 9 ? 20 : 30 : 5;
        System.out.println(discount3);

        int bill4 = 2000;
        int qty4 = 10;
        int days4 = 10;
        int discount4 = (bill4 > 1000) ?
                (qty4 > 11) ?
                        10 :
                        days4 > 9 ?
                                20 :
                                30 :
                5;
        System.out.println(discount4);
    }
}
