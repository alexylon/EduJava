package me.alexandroff.interview.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    String position;

    Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public int compareTo(Employee e) {
        return name.compareTo(e.name);
    }

    public String toString() {
        return name + ": " + position;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Petkan", "driver");
        Employee e2 = new Employee("Dragan", "cook");
        Employee e3 = new Employee("Gosho", "cleaner");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Unsorted: " + employees);
        Collections.sort(employees);
        System.out.println("By name:  " + employees);
    }
}
