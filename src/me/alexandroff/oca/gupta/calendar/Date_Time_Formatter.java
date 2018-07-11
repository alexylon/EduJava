package me.alexandroff.oca.gupta.calendar;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date_Time_Formatter {

    public static void main(String[] args) {

        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
                        FormatStyle.SHORT);
        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // "d" or "dd" for the day of month
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("D.MM.yy"); // "D" for the day of year
        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatter9 = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter formatter10 = DateTimeFormatter.ofPattern("HH:mm, dd.MM.yy");

        LocalDate myBD = LocalDate.of(1972, 5, 4);
        System.out.println(myBD);
        System.out.println(formatter1.format(myBD));
        System.out.println(myBD.format(formatter5)); // Can be reversed - see upper line
        System.out.println(formatter6.format(myBD));
        System.out.println(formatter7.format(myBD));
        System.out.println();

        LocalTime timeNow = LocalTime.now();
        System.out.println(formatter8.format(timeNow));
        System.out.println(formatter9.format(timeNow));
        System.out.println();

        LocalDateTime goApriltsi = LocalDateTime.of(2018, 8, 12, 12, 30);
        System.out.println(formatter10.format(goApriltsi));
        System.out.println(goApriltsi.format(formatter10));
        System.out.println();

        //LocalDate dateToday = LocalDate.parse("2018-07-10", formatter6);
        //System.out.println(dateToday); - Throws Exception

        // Beware of the following.
        // This code is NOT for formatting the output but the input
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse("2057-01-29", d1);
        System.out.println(date1);
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date2 = LocalDate.parse("29.01.2057", d2);
        System.out.println(date2);

    }
}
