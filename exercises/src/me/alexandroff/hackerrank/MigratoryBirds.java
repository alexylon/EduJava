package me.alexandroff.hackerrank;

//You have been asked to help study the population of birds
// migrating across the continent. Each type of bird you are
// interested in will be identified by an integer value.
// Each time a particular kind of bird is spotted,
// its id number will be added to your array of sightings.
// You would like to be able to find out which type of bird
// is most common given a list of sightings. Your task is to print
// the type number of that bird and if two or more types of birds
// are equally common, choose the type with the smallest ID number.

import java.util.*;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        int type = 0;
        int freq = 0;
        int max = 0;
        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            freq = Collections.frequency(arr, arr.get(i));
            if (freq > max) {
                max = freq;
                type = arr.get(i);
            }
        }

        return type;
    }

    public static void main(String[] args) {
        List<Integer> birds1 = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        List<Integer> birds2 = Arrays.asList(1, 4, 4, 4, 5, 3);
        int type1 = migratoryBirds(birds1);
        int type2 = migratoryBirds(birds2);
        System.out.println(type1);
        System.out.println(type2);
    }
}
