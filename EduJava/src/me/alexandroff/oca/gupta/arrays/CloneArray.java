package me.alexandroff.oca.gupta.arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3};
        int[] intArr2 = intArr.clone();
        for (int el : intArr2) {
            System.out.println(el);
        }
        System.out.println(intArr == intArr2); //false
        System.out.println(intArr.equals(intArr2)); //false
        System.out.println(intArr[0] == intArr2[0]); //true
        //System.out.println(intArr[0].equals(intArr2[0]));
        // NO 'equals' on ints

        String[] intStr = {"Alex", "Katia"};
        String[] intStr2 = intStr.clone();
        for (String el : intStr2) {
            System.out.println(el);
        }
        System.out.println(intStr == intStr2); //false
        System.out.println(intStr.equals(intStr2)); //false
        System.out.println(intStr[0] == intStr2[0]); //true
        System.out.println(intStr[0].equals(intStr2[0])); //true
    }
}
