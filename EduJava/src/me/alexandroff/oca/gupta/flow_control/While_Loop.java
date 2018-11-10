package me.alexandroff.oca.gupta.flow_control;

public class While_Loop {

    public static void main(String[] args) {

        int num = 9;
        boolean divisibleBy7 = false;
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
            --num;
        }
    }
}
