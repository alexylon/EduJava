package me.alexandroff.oca.gupta.flow_control;

public class If_Else {

    public static void main(String[] args) {

        boolean testValue = false;

        if (testValue == true) ; // !!! OK. If there is no "else" nor statement no "{}" obligatory

       /* if (testValue == true)
            else
        System.out.println("tra-la-la"); !!! Won't compile - no statement, nor "{}" */

        if (testValue == true) {
        } // !!! OK. If there is no statement, "{}" must be added before "else"
        else
            System.out.println("tra-la-la"); // OK

        if (testValue == true)
            System.out.println("bram-bram-bram"); // OK. There is a statement, "{}" not obligatory
        else
            System.out.println("tra-la-la");
        System.out.println();

        int int1 = 100;
        if (int1 != 100)
            System.out.println("Line 1");
        System.out.println("Line 2");
        /* else
        System.out.println("Line 3"); - !!! "else" won't compile as it is devided from the "if" */

        if (int1 != 100) {
            System.out.println("Line 1");
            System.out.println("Line 2");
        } else
            System.out.println("Line 3");
    }
}
