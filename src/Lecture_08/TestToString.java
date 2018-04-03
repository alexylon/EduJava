package Lecture_08;

public class TestToString {

    public static void main(String[] args)

    {
        Employee emp1 = new Employee("Martinez", "Anthony");
        Employee emp2 = new Employee("Alexandrov", "Alexander");
        System.out.println(emp1 + "\n" + emp2);
    }
}

class Employee {
    private String lastName;
    private String firstName;

    Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString() {
        return "Employee[" + this.firstName + " " + this.lastName + "]";
    }
}
