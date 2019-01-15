package me.alexandroff.oca.practice;

class TestClass1 {
    public static void main(String[] name) {
        int[] ia = new int[10];
        boolean[] ba = new boolean[3];
        String[] stra = new String[5];
        TestClass1[] ta = new TestClass1[5];
        System.out.println(ia.getClass().getName() + " , "
                + ia.getClass().getSuperclass().getName());
        System.out.println(ba.getClass().getName() + " , "
                + ba.getClass().getSuperclass().getName());
        System.out.println(stra.getClass().getName() + " , "
                + stra.getClass().getSuperclass().getName());
        System.out.println(ta.getClass().getName() + " , "
                + ta.getClass().getSuperclass().getName());

        //[I , java.lang.Object
        //[Z , java.lang.Object
        //[Ljava.lang.String; , java.lang.Object
        //[Lme.alexandroff.oca.practice.TestClass1; , java.lang.Object
    }
}


