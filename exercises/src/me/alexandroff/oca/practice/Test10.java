package me.alexandroff.oca.practice;

public class Test10 {
    public static void main(String[] args) {

        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long l1 = 1L;

        System.out.println(i1 == i2);//false
        System.out.println(i1 == i3);//true
        //because one operand is a primitive int and so the other
        // will be auto-unboxed and then the value will be compared
        /*
        System.out.println(i1 == b1); - Won't compile
        System.out.println(i1 == l1); - Won't compile
        */
        //because type of i1 and b1 references are classes
        //that are not in the same class hierarchy

        System.out.println(i1.equals(i2));//true
        System.out.println(i1.equals(i3));//true
        System.out.println(i1.equals(b1));//false
        System.out.println(i1.equals(l1));//false
    }
}

/*
Signature of equals method is : 'boolean equals(Object o)';
So it can take any object hence there will be no compilation error.
Further, The equals methods of all wrapper classes first check if
the two object are of same class or not.
If not, they immediately return false.
 */
