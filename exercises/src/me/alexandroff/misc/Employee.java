package me.alexandroff.misc;

import java.util.Comparator;

public class Employee {
    String name;
    int years;

    Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[3];
        employeeArray[0] = new Employee("Xander", 1);
        employeeArray[1] = new Employee("John", 3);
        employeeArray[2] = new Employee("Anna", 2);
        java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i].name);
        }
    }
}
