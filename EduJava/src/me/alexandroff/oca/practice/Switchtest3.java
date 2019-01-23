package me.alexandroff.oca.practice;

public class Switchtest3 {
    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            default:
                System.out.println("default");
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
        }
    }
}
//Since there is no match it begins with 'default'
//and ends to 'break'.