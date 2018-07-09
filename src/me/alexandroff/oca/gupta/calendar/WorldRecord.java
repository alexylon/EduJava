package me.alexandroff.oca.gupta.calendar;

import java.time.LocalTime;

public class WorldRecord {

    public static void main(String[] args) {

        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");
    }
}
