package me.alexandroff.oca.gupta.calendar;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Manipulate_Period {

    public static void main(String[] args) {

        LocalDate myBDay = LocalDate.of(1972, 5, 14);
        LocalDate katiaBDay = LocalDate.of(1986, 11, 15);
        System.out.println("Our difference is: " + Period.between(myBDay, katiaBDay));

        if (myBDay.isBefore(katiaBDay)) {
            System.out.println("I am older than Katia");
        } else
            System.out.println("Katia is older than me");
        System.out.println();

        Period period10D = Period.of(0, 0, 10);
        Period period1M = Period.of(0, 1, 0);
        System.out.println(period10D.minus(period1M));
        System.out.println(period1M.minus(period10D));
        System.out.println(period10D.plusDays(20));
        System.out.println(period10D.minusMonths(2));
        System.out.println(period10D.plusYears(5));
        System.out.println(myBDay.plus(Period.of(14, 6, 1)));
        System.out.println(myBDay.minus(Period.ofYears(14)));
        System.out.println();

        Period year1Month9Day20 = Period.of(1, 9, 20);
        System.out.println(year1Month9Day20.multipliedBy(2)); // There is NO dividedBy()
        System.out.println(year1Month9Day20.multipliedBy(-2));

        Period newPeriod = year1Month9Day20.withYears(5);
        System.out.println(newPeriod);
        System.out.println();

        System.out.println(year1Month9Day20.toTotalMonths()); // 21 months
        Period year1Month9Day40 = Period.of(1, 9, 40);
        System.out.println(year1Month9Day40.toTotalMonths()); // Again 21 months - doesn't include days
    }
}
