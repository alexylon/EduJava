package me.alexandroff.oca.gupta.calendar;

import java.time.LocalTime;

public class Manipulate_LocalTime {

    public static void main(String[] args) {

        int shiftMinInt = 30;
        long shiftMinLong = 45l; // Accepts long

        LocalTime time = LocalTime.of(22, 15, 01);

        LocalTime time1 = time.minusMinutes(shiftMinInt);
        LocalTime time2 = time.plusMinutes(shiftMinInt);
        LocalTime time3 = time.minusMinutes(shiftMinLong);
        LocalTime time4 = time.plusMinutes(shiftMinLong);

        System.out.println(time);
        System.out.println(time1 + " | " + time2 + " | "
                + time3 + " | " + time4);

        LocalTime newTime = time.withMinute(0).withSecond(0); // Accepts int
        System.out.println(newTime);
    }
}
