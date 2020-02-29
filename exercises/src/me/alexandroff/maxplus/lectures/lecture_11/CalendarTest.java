package me.alexandroff.maxplus.lectures.lecture_11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.MONTH, 6);

        System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE));
        System.out.println(df.format(calendar.getTime()));
    }
}
