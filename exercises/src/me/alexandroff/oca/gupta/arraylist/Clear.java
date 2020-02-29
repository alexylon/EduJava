package me.alexandroff.oca.gupta.arraylist;

import java.util.ArrayList;

public class Clear {

    public static void main(String[] args) {

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb0 = new StringBuilder("Zero");
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        StringBuilder sb5 = new StringBuilder("Five");

        StringBuilder[] sb = new StringBuilder[]{sb0, sb1, sb2,
                sb3, sb4, sb5};

        for (StringBuilder word : sb) {
            list.add(word);
        }

        System.out.println("List: " + list);
        list.clear();
        System.out.println("List: " + list);
    }
}
