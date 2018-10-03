package me.alexandroff.oca.gupta.flow_control;

public class Twist_5_4 {

    public static void main(String[] args) {

        String[] programmers = {"Outer", "Inner"};

        for (String outer : programmers) {
            for (String inner : programmers) {
                if (inner.equals("Inner"))
                    break;
                System.out.print(inner + ":");
            }
        }

        System.out.println();

        outer:
        for (String outer : programmers) {
            for (String inner : programmers) {
                if (inner.equals("Inner"))
                    break outer;
                System.out.print(inner + ":");
            }
        }
        // When this code executes "break outer;",
        // control transfers to the line of text
        // that marks the end of this block.
        // It doesn’t transfer control to the label "outer".
    }
}
