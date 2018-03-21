import java.util.Scanner;

public class ClassRoom {

    public static void main(String[] args) {

        System.err.println("Error");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");

        String wholeLine = scanner.nextLine();
        System.out.println(wholeLine);
    }
}
