package me.alexandroff.oca.practice;

import java.time.*;
import java.util.*;

public class EqualsOverridden {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 1, 19);
        LocalDate date2 = LocalDate.of(2019, 1, 19);
        System.out.println(date1.equals(date2));

        LocalTime time1 = LocalTime.of(14, 46);
        LocalTime time2 = LocalTime.of(14, 46, 0);
        System.out.println(time1.equals(time2));

        String s = "Hello";
        String t = new String(s);
        System.out.println(s.equals(t));

        List<String> list1 = new ArrayList();
        list1.add("Alex");
        list1.add("Katia");
        List<String> list2 = new ArrayList();
        list2.add("Alex");
        list2.add("Katia");
        System.out.println(list1.equals(list2));
    }
}
