package me.alexandroff.oca.simulator;

public class Test11 {
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println();

        int a = 1;
        int b = -a;
        System.out.println(a + ":" + b);

        int c = -5;
        int d = -c;
        System.out.println(c + ":" + d);

        int e = Integer.MIN_VALUE;
        int f = -e;
        System.out.println(e + ":" + f);//???
    }
}
