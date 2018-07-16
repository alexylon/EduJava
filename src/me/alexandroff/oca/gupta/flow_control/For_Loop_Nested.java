package me.alexandroff.oca.gupta.flow_control;

public class For_Loop_Nested {

    public static void main(String[] args) {

        for (int hrs = 1; hrs <= 2; hrs++) {
            for (int min = 1; min <= 60; min++) {
                System.out.println(hrs + ":" + min);
            }
        }


    }
}
