package me.alexandroff.hackerrank;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

class RunStudent {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
}

