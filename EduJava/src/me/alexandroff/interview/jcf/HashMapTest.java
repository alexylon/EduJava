package me.alexandroff.interview.jcf;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Ekaterina");
        map.put(4, "Konstantin");
        map.put(6, "Ekaterina");
        map.put(1, "Alexander");
        map.put(3, "Anastasia");
        map.put(5, "Alexander");

        System.out.println(map);

        map.remove(5);
        map.remove(6, "Ekaterina");
        map.remove(7); //Doesn't do anything
        map.remove(8, "Blagoy"); //Doesn't do anything
        System.out.println(map);
    }
}
