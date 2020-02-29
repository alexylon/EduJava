package me.alexandroff.oca.gupta.calendar;

import java.time.LocalDate;
import java.time.Period;

public class Period_Test {

    public static void main(String[] args) {

        Period period1 = Period.of(1, 6, 20);
        Period years = Period.ofYears(2);
        Period months = Period.ofMonths(-8); // Period CAN be negative!!!
        Period days = Period.ofDays(7);
        Period weeks = Period.ofWeeks(4);
        System.out.println(period1 + " | " + years + " | " + months
                + " | " + days + " | " + weeks);

        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");
        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");
        Period p5Yrs11 = Period.parse("-P5y1m2d"); // "-" applies to all values
        Period p5Yrs12 = Period.parse("P5y-1m2d"); // "-" applies only to months
        System.out.println(p5Yrs1 + " | " + p5Yrs2);
        System.out.println(p5Yrs11 + " | " + p5Yrs12);
        System.out.println();

        LocalDate myBirthday = LocalDate.of(1972, 5, 14);
        LocalDate koseBirthday = LocalDate.of(2016, 10, 14);
        LocalDate dateNow = LocalDate.now();
        Period myAge = Period.between(myBirthday, dateNow); // period = end date - start date
        // Period myAge2 = dateNow.minus(myBirthday); - Won't compile
        Period koseAge = Period.between(koseBirthday, dateNow);
        System.out.println("I am " + myAge + " old");
        System.out.println("Koseto is " + koseAge.getYears() + " year, "
                + koseAge.getMonths() + " months and " + koseAge.getDays()
                + " days" + " old");
        System.out.println();

        Period days5 = Period.of(0,0,5);
        System.out.println(days5.isZero());
        Period daysMinus5 = Period.of(0,0,-5);
        System.out.println(daysMinus5.isNegative());
    }
}
