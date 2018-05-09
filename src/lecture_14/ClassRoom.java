package lecture_14;

import java.util.*;

public class ClassRoom {

    public static void main(String[] args) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some words: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            } else {
                Integer wordCount = wordFrequency.get(word);
                wordCount++;
                wordFrequency.put(word, wordCount);
            }
        }

        for (String key : wordFrequency.keySet()) {
            System.out.println(key + " : " + wordFrequency.get(key));
        }

        //lambda
        wordFrequency.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
