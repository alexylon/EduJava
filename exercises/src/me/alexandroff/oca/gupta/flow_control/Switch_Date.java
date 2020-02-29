package me.alexandroff.oca.gupta.flow_control;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Switch_Date {

    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        DayOfWeek dayWeek = dateNow.getDayOfWeek();
        System.out.println(dayWeek);
        String day = dayWeek.name();

        if (day.equals("MONDAY") || day.equals("TUESDAY") ||
                day.equals("WEDNESDAY") || day.equals("THURSDAY"))
            System.out.println("Time to work");
        else if (day.equals("FRIDAY"))
            System.out.println("Nearing weekend");
        else if (day.equals("SATURDAY") || day.equals("SUNDAY"))
            System.out.println("Weekend!");
        else
            System.out.println("Invalid day?");

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
                System.out.println("Time to work");
                break;
            case "FRIDAY":
                System.out.println("Nearing weekend");
                break;
            default:
                System.out.println("Invalid day?");
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Weekend!");
                break;
            // Any order "case - default" is valid
        }
    }
}
