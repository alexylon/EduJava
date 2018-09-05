package me.alexandroff.oca.gupta.lambdas;

public interface StringTest {
    String inputName(String name);

    public static void main(String[] args) {
        StringTest morningGreeting = str -> "Good morning " + str + "!";
        StringTest afternoonGreeting = (String str) -> "Good afternoon " + str + "!";
        //Brackets mandatory when type specified
        StringTest eveningGreeting = (str1) -> "Good evening " + str1 + "!";

        System.out.println(morningGreeting.inputName("Alex"));
        System.out.println(afternoonGreeting.inputName("Katia"));
        System.out.println(eveningGreeting.inputName("Asi"));
    }
}


