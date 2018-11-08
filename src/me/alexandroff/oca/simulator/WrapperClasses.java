// !!!
package me.alexandroff.oca.simulator;

import java.util.*;

public class WrapperClasses {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        // !!! prints '1',
        // because removes the element with INDEX 1

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.remove(new Integer(1));
        System.out.println(numbers2);
        // Prints '2' because removes the VALUE.
    }
}
