package me.alexandroff.interview.algorithms;

// The day of the programmer in Russia (256-th)

public class DayOfProgrammer {
    static String dayOfProgrammer(int year) {
        if (year == 1918) {
            return "26.09.1918";
        }

        if (year >= 1918) {
            if (year % 100 == 0 && year % 400 != 0) {
                return "13.09." + year;
            } else if (year % 400 == 0 || year % 4 == 0) {
                return "12.09." + year;
            } else
                return "13.09." + year;
        }

        if (year < 1918) {
            if (year % 4 == 0) {
                return "12.09." + year;
            } else
                return "13.09." + year;
        }

        return "13.09." + year;
    }

    public static void main(String[] args) {
        String dop1 = dayOfProgrammer(2017);
        String dop2 = dayOfProgrammer(2016);
        String dop3 = dayOfProgrammer(1800);
        String dop4 = dayOfProgrammer(1918);
        System.out.println(dop1);
        System.out.println(dop2);
        System.out.println(dop3);
        System.out.println(dop4);


    }
}
