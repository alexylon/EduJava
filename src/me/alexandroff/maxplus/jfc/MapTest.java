package me.alexandroff.maxplus.jfc;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> mapA = new HashMap<>();
        Map mapB = new TreeMap();
        Map mapC = new Hashtable();

        mapA.put("key1", "element 1");
        mapB.put("key2", "element 2");
        mapC.put("key3", "element 3");

        for (String key : mapA.keySet()) {
            System.out.println(mapA.get(key));
        }

        for (String value : mapA.values()) {
            System.out.println(value);
        }

        for (Map.Entry entry : mapA.entrySet()) {
            System.out.println("[" + entry.getKey() + "," + entry.getValue() + "]");
        }
    }
}
