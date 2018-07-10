package me.alexandroff.oca.gupta.calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Manipulate_LocalDate_LocalDateTime {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2018, 1, 31);
        System.out.println(date1.plus(Period.ofDays(1)));
        System.out.println(date1.plus(Period.ofMonths(1)));
        System.out.println(date1.plus(Period.ofMonths(-1)));
        System.out.println(date1.minus(Period.ofMonths(1)));
        System.out.println(date1.minus(Period.ofWeeks(4)));
        System.out.println();

        LocalDateTime dateTime1 = LocalDateTime.parse("2020-01-31T14:18:36");
        System.out.println(dateTime1.minus(Period.ofYears(2)));


    }
}
