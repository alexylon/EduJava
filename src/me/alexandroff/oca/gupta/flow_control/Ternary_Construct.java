package me.alexandroff.oca.gupta.flow_control;

public class Ternary_Construct {

    public static void main(String[] args) {

        int bill = 200;
        int discount;

        // (bill > 200) ? discount = 15 : discount = 10; - Won't compile, variable expected

        discount = (bill > 199) ? 15 : 10;
        System.out.println("For bill $" + bill + " the discount is " + discount + "%");
        System.out.println();

        // discount = (bill > 199) ? 15; - Won't compile, there is no "else" part

        /*
        long bill = 2000;
        int discount = (bill > 2000) ? bill - 100 : bill - 50;
        Won't compile, "int" cannot accept "long"
        */

        /*
        Long discount = (5000 > 2000)? new Integer(10) : new Integer(15);
        Won't compile, wrapper classes are not interchangable
         */

        bill = bill > 199 ? bill - 15 : bill - 10;
        System.out.println("Your bill is $" + bill);
        System.out.println();

        Integer bill1 = 200; // Just for fun
        int discount1 = (bill1 > 199) ? getSpecDisc() : getRegDisc();
        System.out.println("Your discount is " + discount1 + "%");

    }

    static int getRegDisc() {
        return 10;
    }

    static int getSpecDisc() {
        return 15;
    }
}
