package me.alexandroff.interview.algorithms;

import java.util.*;

public class MigratoryBirds2 {
    static int migratoryBirds(List<Integer> arr) {
        int type = 0;
        int freq = 0;
        int max = 0;
        Collections.sort(arr);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.size(); i++) {
            Integer count = map.get(arr.get(i));
            map.put(arr.get(i), count == null ? 1 : count + 1);   //auto boxing and count
        }
        System.out.println(map);


        return type;
    }

    public static void main(String[] args) {
        List<Integer> birds1 = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        List<Integer> birds2 = Arrays.asList(1, 4, 4, 4, 5, 3);
        int type1 = migratoryBirds(birds1);
        int type2 = migratoryBirds(birds2);
        //System.out.println(type1);
        //System.out.println(type2);
    }
}
