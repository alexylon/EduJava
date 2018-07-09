package me.alexandroff.oca.gupta.calendar;

import java.time.LocalTime;

public class Local_Time {

    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        LocalTime timeBreakfast = LocalTime.of(8, 0);
        LocalTime timeSec = LocalTime.of(16, 12, 42);
        LocalTime timeNano = LocalTime.of(23, 45, 56, 987612);
        LocalTime timeParse = LocalTime.parse("09:05:01");
        // LocalTime timeParse2 = LocalTime.parse("9:5:1"); - Throws Exeption. Must have two digit format
        LocalTime alexTime = LocalTime.of(0, 25, 10);
        LocalTime katiaTime = LocalTime.parse("00:20:05");

        System.out.println(timeNow);
        System.out.println(timeBreakfast);
        System.out.println(timeSec);
        System.out.println(timeNano);
        System.out.println(timeParse);
        System.out.println();

        if (katiaTime.isBefore(alexTime)) {
            System.out.println("Katia wins over Alex with: " + katiaTime
                    + " : " + alexTime);
        } else {
            System.out.println("Alex wins over Katia with: " + alexTime
                    + " : " + katiaTime);
        }

        System.out.println(alexTime.getHour()); // NO getHours()
        System.out.println(alexTime.getMinute()); // NO getMinutes()
        System.out.println(alexTime.getSecond()); // NO getSeconds()
        System.out.println(alexTime.getNano()); // NO getNanoSeconds()


    }
}
