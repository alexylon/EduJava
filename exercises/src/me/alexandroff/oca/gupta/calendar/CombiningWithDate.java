package me.alexandroff.oca.gupta.calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CombiningWithDate {

    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        LocalDate dateNow = LocalDate.now();
        LocalDateTime dateTime = timeNow.atDate(dateNow);
        System.out.println("It is " + dateTime + " now.");

        // Or just...
        System.out.println("Or just...");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
    }
}
