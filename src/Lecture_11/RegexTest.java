package Lecture_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {

        String text = "003591234567";

        String patternString = "\\d";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        String replaceAll = matcher.replaceAll("X");
        System.out.println("replaceAll = " + replaceAll);
    }
}
