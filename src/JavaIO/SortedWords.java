package JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedWords {

    public static void main(String[] args) throws FileNotFoundException {
        new SortedWords().getSortedWords();
    }

    public void getSortedWords() throws FileNotFoundException {

        String word;
        Scanner scan = new Scanner(new File("/Users/alex/words.txt"));
        List<String> list = new ArrayList<>();

        while (scan.hasNext()) {
            word = scan.next();

            list.add(word);

        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
