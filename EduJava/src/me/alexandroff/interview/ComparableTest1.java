package me.alexandroff.interview;

import java.util.*;

class DVDInfo implements Comparable<DVDInfo> {
    String title;
    String genre;
    String leadActor;

    DVDInfo(String t, String g, String a) {
        title = t;
        genre = g;
        leadActor = a;
    }

    public String toString() {
        return title + " " + genre + " " + leadActor + "\n";
    }

    public int compareTo(DVDInfo d) {
        return title.compareTo(d.getTitle());
    }

    public String getTitle() {
        return title;
    }
// other getters and setters
}

class DVDTest {
    public static void main(String[] args) {
        DVDInfo dvd1 = new DVDInfo("Star Wars", "SciFi", "Luke");
        DVDInfo dvd2 = new DVDInfo("Apple", "IT", "Steve Jobs");

        ArrayList<DVDInfo> dvdList = new ArrayList<>();
        dvdList.add(dvd1);
        dvdList.add(dvd2);
        System.out.println(dvdList);

        Collections.sort(dvdList);
        System.out.println(dvdList);
    }
}
