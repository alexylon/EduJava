package me.alexandroff.oca.gupta.exception_handling;

import java.util.ArrayList;

//When class fields are not initialized but accessed throws NullPointerException
//When class fields are not initialized but printed, prints "null"
//When local variables are not initialized but accessed OR printed, fails to compile

//Class fields that are not initialized ARE implicitly "null",
// but local variables are even NOT "null"

//When both class fileds or local variables are explicitly "null" - NullPointerException
//when accessed and "null" if printed

public class NullPointerExceptionClass {

    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> words;
    static ArrayList<String> staticList;

    public static void main(String[] args) {
        NullPointerExceptionClass obj = new NullPointerExceptionClass();
        obj.list.add("Alex");
        obj.list.add("Katia");
        //list.add("Anastasia");
        // Non-static field "list" cannot be accessed from a static method

        //System.out.println(list);
        // Non-static field "list" cannot be accessed from a static method
        System.out.println(obj.list);

        staticList = new ArrayList<>(); // It is "static", no object needed
        staticList.add("Vania");
        staticList.add("Krum");
        System.out.println(staticList);

        System.out.println(obj.words); // Prints "null", there is no Runtime exception
        obj.words.add("Kose");
        //NullPointerException because "words" is implicitly "null"
        // (there is no object created).

        //The propper way is to check if it is null
        if (obj.words != null)
            obj.words.add("Kose");

        ArrayList<String> insideList;
        //insideList.add("Kose");
        //Fails to compile as "insideList" is not initialized
        //System.out.println(insideList); - Won't compile

        String[] newLaptops = new String[2];
        System.out.println(newLaptops[1]); //Prints "null"
        System.out.println(newLaptops[1].toString()); //NullPointerException
    }
}
