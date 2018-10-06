package me.alexandroff.oca.gupta.wrapper_classes;


public class WrapperClasses {

    public static void main(String... aaa) {

        Integer int1 = 100;
        Integer int2 = new Integer(200);
        Integer int3 = new Integer("300");
        Integer int4 = Integer.valueOf(400);
        String str5 = "500";
        Integer int5 = null;
        int int6 = 600;

        System.out.println(int1 + ", " + int2 + ", "
                + int3 + ", " + int4 + ", " + int5 + ", " + int6);

        System.out.println();
        System.out.println(int1 + int2 + int3 + int4 + int6);
        System.out.println();

        System.out.println(int3.intValue());
        System.out.println(int3.doubleValue());
        System.out.println(Integer.parseInt(str5)
                + Integer.valueOf(str5));
        System.out.println(Double.valueOf(str5));
        System.out.println(Double.parseDouble(str5));
        System.out.println(Double.valueOf(int6));

        System.out.println();

        System.out.println(int5);
        //System.out.println(int1 + int2 + int3 + int4 + int5 + int6);
        // - NullPointerException
        //System.out.println(Integer.valueOf(int5));
        // - NullPointerException
        //System.out.println(int5.intValue());
        // - NullPointerException
        //System.out.println(Double.parseDouble(int6));
        // - String only


    }
}
