package me.alexandroff.oca.practice;

public class StringTest {
    static public void main(String[] args) { //!!!
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");
        System.out.println();

        int numFish = 4;
        String fishType = "tuna";
        //String anotherFish1 = numFish + 1;
        //DOES NOT COMPILE
        String anotherFish = numFish + 1 + ""; //OK
        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }
}
