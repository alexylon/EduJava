package me.alexandroff.interview.jcf;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Ekaterina");
        queue.add("Konstantin");
        queue.add("Alexander");
        queue.add("Anastasia");
        queue.add("Alexander");

        System.out.println(queue);

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}
