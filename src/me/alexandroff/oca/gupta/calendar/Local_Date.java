package me.alexandroff.oca.gupta.calendar;

import java.time.LocalDate;

public class Local_Date {

    public static void main(String[] args) {

        System.out.println(LocalDate.of(2015, 12, 27));
        System.out.println();

        LocalDate katiaBirthday = LocalDate.parse("1986-11-15");

        LocalDate myBirthday = LocalDate.parse("1972-05-14");
        System.out.println(myBirthday);
        System.out.println(".getDayOfMonth() : " + myBirthday.getDayOfMonth());
        System.out.println(".getDayOfWeek()  : " + myBirthday.getDayOfWeek());
        System.out.println(".getDayOfYear()  : " + myBirthday.getDayOfYear());
        System.out.println(".getMonth()      : " + myBirthday.getMonth());
        System.out.println(".getMonthValue() : " + myBirthday.getMonthValue());
        System.out.println(".getYear()       : " + myBirthday.getYear());
        System.out.println();

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        System.out.println(".getDayOfMonth() : " + dateNow.getDayOfMonth());
        System.out.println(".getDayOfWeek()  : " + dateNow.getDayOfWeek());
        System.out.println(".getDayOfYear()  : " + dateNow.getDayOfYear());
        System.out.println(".getMonth()      : " + dateNow.getMonth());
        System.out.println(".getMonthValue() : " + dateNow.getMonthValue());
        System.out.println(".getYear()       : " + dateNow.getYear());
        System.out.println();

        System.out.println("katiaBirthday.isAfter(myBirthday)  : " + katiaBirthday.isAfter(myBirthday));
        System.out.println("katiaBirthday.isBefore(myBirthday) : " + katiaBirthday.isBefore(myBirthday));
        System.out.println();

        System.out.println("dateNow.minusDays(10) : " + dateNow.minusDays(10));
        System.out.println("dateNow.minusMonths(2) : " + dateNow.minusMonths(2));
        System.out.println("dateNow.minusWeeks(30) : " + dateNow.minusWeeks(30));
        System.out.println("dateNow.minusYears(1) : " + dateNow.minusYears(1));
        System.out.println("dateNow.plusDays(10) : " + dateNow.plusDays(10));
        System.out.println("dateNow.plusMonths(2) : " + dateNow.plusMonths(2));
        System.out.println("dateNow.plusWeeks(30) : " + dateNow.plusWeeks(30));
        System.out.println("dateNow.plusYears(1) : " + dateNow.plusYears(1));
    }
}
