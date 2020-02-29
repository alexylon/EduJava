package me.alexandroff.oca.gupta.flow_control;

public class If_Else_Nested {

    public static void main(String[] args) {

        int int1 = 100;

        if (int1 > 50)
            if (int1 > 200)
                if (int1 > 500)
                    System.out.println("Bravo!");
                else
                    System.out.println("Not Bravo");
            else
                System.out.println("It is not fine");

// The same code but with "{}"
        if (int1 > 50) {
            if (int1 > 200)
                if (int1 > 500)
                    System.out.println("Bravo!");
                else
                    System.out.println("Not Bravo");
        } else
            System.out.println("It is not fine");
    }
}
