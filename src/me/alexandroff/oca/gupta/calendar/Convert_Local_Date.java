package me.alexandroff.oca.gupta.calendar;

import java.time.LocalDate;
import java.time.LocalTime;

public class Convert_Local_Date {

    public static void main(String[] args) {

        LocalDate interviewDate = LocalDate.of(2016, 02, 28);
        System.out.println(interviewDate.atTime(16, 30));
        System.out.println(interviewDate.atTime(16, 30, 20));
        System.out.println(interviewDate.atTime(16, 30, 20, 300));
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));
        System.out.println();

        LocalDate interviewDate2 = LocalDate.parse("2016-02-28");
        System.out.println(interviewDate2.atTime(16, 30));
        System.out.println(interviewDate2.atTime(16, 30, 20));
        System.out.println(interviewDate2.atTime(16, 30, 20, 300));
        System.out.println(interviewDate2.atTime(LocalTime.of(16, 30)));
        System.out.println();

        LocalDate launchBook = LocalDate.of(2016, 2, 8);
        LocalDate myBirthday = LocalDate.of(1972, 5, 14);
        System.out.println(launchBook.toEpochDay());
        System.out.println(myBirthday.toEpochDay());
        // In standard date and time, the epoch date refers to January 1, 1970,
        //00:00:00 GMT.
    }
}
