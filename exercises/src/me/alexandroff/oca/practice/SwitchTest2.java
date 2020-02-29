package me.alexandroff.oca.practice;

public class SwitchTest2 {
    public static void main(String[] args) {
        String str = "three";
        switch (str) {
            case ("one"):
            default:
                System.out.println("Default");
            case ("two"):
                System.out.println("Two");
                break;
            case ("three"):
                System.out.println("Three");
        }
    }
}

//Since there IS a match it begins with the matched 'case'