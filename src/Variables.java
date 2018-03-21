import java.util.Scanner;

public class Variables {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input variable a: ");
        int a = in.nextInt();
        System.out.print("Input variable b: ");
        int b = in.nextInt();
        System.out.print("Input variable c: ");
        int c = in.nextInt();
        System.out.println("The values of c, b and a are: " + c + b + a);
    }
}
