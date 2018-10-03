package me.alexandroff.oca.gupta.wrapper_classes;

public class Wrapper_Classes_Test1 {

    public static void main(String[] args) {

        String str1 = "300";
        Integer int1_Integer = new Integer(str1);
        int int1_valueOf = Integer.valueOf(str1);
        Integer int2_valueOf = Integer.valueOf(str1);
        int int1_parseInt = Integer.parseInt(str1);
        int int1_int = 300;
        int int2 = int1_Integer;
        int int3 = int1_Integer.intValue();

        //System.out.println(int1_Integer == str1);
        // Won't compile
        System.out.println("int1_Integer == int1_int: "
                + (int1_Integer == int1_int));
        System.out.println("int2_valueOf == int1_int: "
                + (int2_valueOf == int1_int));
        System.out.println("int1_Integer == int2_valueOf: "
                + (int1_Integer == int2_valueOf));
        System.out.println("int1_Integer.equals(int2_valueOf): "
                + (int1_Integer.equals(int2_valueOf)));
        System.out.println();

        System.out.println("int1_valueOf == int1_parseInt: "
                + (int1_valueOf == int1_parseInt));
        System.out.println("int1_int == int1_valueOf: "
                + (int1_int == int1_valueOf));
        System.out.println("int1_int == int1_parseInt: "
                + (int1_int == int1_parseInt));
        System.out.println("int2_valueOf == int1_parseInt: "
                + (int2_valueOf == int1_parseInt));





    }
}
