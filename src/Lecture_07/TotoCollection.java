package Lecture_07;

import java.util.ArrayList;
import java.util.Random;

public class TotoCollection {

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,
                                                                   int max) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() < size) {
            int random = getRandomInt(min, max);

            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        return numbers;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = getRandomNonRepeatingIntegers(6, 1, 49);
        System.out.print("Toto 6 of 49 result: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
