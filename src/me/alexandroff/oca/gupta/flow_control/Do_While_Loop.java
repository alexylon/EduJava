package me.alexandroff.oca.gupta.flow_control;

public class Do_While_Loop {

    public static void main(String[] args) {

        int num = 9;
        boolean divisibleBy7 = false;
        do {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            num--;
        } while (divisibleBy7 == false);
        // Don’t forget to use a semicolon (;) to end the do-while loop
        // after specifying its condition
        System.out.println();

        int num2 = 9;
        boolean divBy7 = true;
        do {
            System.out.println(num2);
            if (num2 % 7 == 0) divBy7 = true;
            num2--;
        } while (divBy7 == false);
        // The do-while loop executes once, even though
        // the condition specified in the do-while loop evaluates to "false"
    }
}
