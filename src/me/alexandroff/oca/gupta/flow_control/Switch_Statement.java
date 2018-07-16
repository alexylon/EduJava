package me.alexandroff.oca.gupta.flow_control;

public class Switch_Statement {

    public static void main(String[] args) {

        // A switch statement accepts arguments of types "char, byte, short, int, String,
        // enum, Character, Byte, Integer, and Short".
        // The switch statement doesn’t accept arguments of type "long, float, or double",
        // or any object besides String.

        String str1 = null;
        /* switch (str1) {
            default:
                System.out.println("Not allowed");
            case "Hello":
                System.out.println("Allowed");
        } - NullPointerException - value cannot be null, but "default" CAN be first */

        int a = 10, b = 20, c = 30;
        final int d = 40, e = 50;
        final int f;
        f = 60;
        switch (a) {
            case 5 + 10: // OK
                System.out.println(20 + 30);
                break;
            // case b + c: - Won't compile, statement must be a constant
            //  System.out.println("Not acceptable);
            // break;
            case d + e: // OK, since it is a constant
                System.out.println("Acceptable");
                break;
            case e - 40:
                System.out.println("Right");
                break;
            // case f + 20: !!! Very strange but WON'T compile, because
            // the "final" variable f isn’t initialized with its declaration
            // "default" CAN be missed
        }

        String name = "Alex";
        switch (name) {
            case "Alex":
                System.out.println("That's me");
                break;
            // case null: "null" not acceptable as a case label

        }


    }
}
