package me.alexandroff.maxplus.jcf;

import java.util.*;

public class ArrayListString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some words: ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        List<String> words = new ArrayList<>();

        for (String w : parts) {
            words.add(w);
        }

        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);

        Set<String> unique = new HashSet<>();
        Set<String> nonUnique = new HashSet<>();

        for (String word : words) {
            unique.add(word);
        }

        for (String word: words) {
            if (unique.contains(word)) {
                nonUnique.add(word);
            }
        }

        System.out.println(unique);
        System.out.println(nonUnique);

    }
}
