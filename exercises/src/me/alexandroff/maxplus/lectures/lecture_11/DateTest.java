package me.alexandroff.maxplus.lectures.lecture_11;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest {

    public static void main(String[] args) {
        Date today = new Date();//gets current date

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println(formatter1.format(today));


        //if (today.after(afterSomeTime)) {
        //  System.out.println("Before");
        //}
    }
}

