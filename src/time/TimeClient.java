package time;

import java.util.Scanner;

public class TimeClient {

    public static void main(String[] args) {

        Time time = new Time(11, 59, 59.9);

        System.out.println(time);
        System.out.println();
        System.out.println("The hour is: " + time.getHour());
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set new hour: ");
        int newHour = scanner.nextInt();
        time.setHour(newHour);
        System.out.println(time);
    }
}
