package my;

public class User2 {


    String firstName;
    String lastName;
    int age;
    String gender;

    private User2(String firstName, String lastName, int age, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }


    public static void main(String[] args) {

        User2 user2 = new User2("Александър",
                "Александров", 45, "мъж");
        User2 user3 = new User2("Екатерина",
                "Александрова", 31, "жена");

        System.out.println("Име: " + user2.firstName);
        System.out.println("Фамилия: " + user2.lastName);
        System.out.println("Години: " + user2.age);
        System.out.println("Пол: " + user2.gender);
        System.out.println();
        System.out.println("Име: " + user3.firstName);
        System.out.println("Фамилия: " + user3.lastName);
        System.out.println("Години: " + user3.age);
        System.out.println("Пол: " + user3.gender);
    }
}
