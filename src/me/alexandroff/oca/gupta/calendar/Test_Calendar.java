package me.alexandroff.oca.gupta.calendar;

import java.sql.SQLOutput;
import java.time.*;

public class Test_Calendar {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(21, 15);
        LocalDate date = LocalDate.parse("2019-05-14");
        LocalDateTime dateTime = LocalDateTime.of(2052, 11, 15, 21, 15);

        System.out.println(time);
        System.out.println(date);
        System.out.println(dateTime);

        LocalDateTime dateTime2 = time.atDate(date);
        System.out.println(dateTime2);

        System.out.println("getYear(): " + date.getYear());
        System.out.println("getYear(): " + dateTime.getYear());
        System.out.println("getYear(): " + dateTime2.getYear());
        System.out.println("getMonth(): " + date.getMonth());
        System.out.println("getMonthValue(): " + date.getMonthValue());
        System.out.println("getMonth(): " + dateTime.getMonth());
        System.out.println("getMonthValue(): " + date.getMonthValue());
        System.out.println("getMinute(): " + time.getMinute());
        System.out.println("getMinute(): " + dateTime.getMinute());
        System.out.println("LocalTime.MIN: " + LocalTime.MIN);
        System.out.println("LocalTime.MIDNIGHT: " + LocalTime.MIDNIGHT);
        System.out.println("LocalTime.MAX: " + LocalTime.MAX);
        System.out.println("LocalTime.NOON: " + LocalTime.NOON);
        System.out.println("LocalDate.MIN: " + LocalDate.MIN);
        System.out.println("LocalDate.MIN: " + LocalDate.MAX);
        System.out.println("LocalDate.ofYearDay(1972, 172): " + LocalDate.ofYearDay(1972, 172));
    }
}
