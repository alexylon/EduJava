package Lecture_05;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {


        int employeeNumber;
        double weeklyTime;
        double overTime;
        double hourlySalary;
        double regularPay;
        double overtimePay;
        double totalPay;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        employeeNumber = scanner.nextInt();

        System.out.print("Enter weekly time: ");
        weeklyTime = scanner.nextDouble();

        System.out.print("Enter hourly salary: ");
        hourlySalary = scanner.nextDouble();

        overTime = weeklyTime % 40;

        if (employeeNumber == 5712) {
            System.out.println("Employee name: Petar");
        }
        if (employeeNumber == 8412) {
            System.out.println("Employee name: Hristo");
        }

        regularPay = hourlySalary*40;
        overtimePay = overTime*hourlySalary*2;
        totalPay = regularPay + overtimePay;

        System.out.println("Hourly salary: " + hourlySalary);
        System.out.println("Weekly time: " + weeklyTime);
        System.out.println("Overtime: " + overTime);
        System.out.println("Regular pay: " + regularPay);
        System.out.println("Overtime pay: " + overtimePay);
        System.out.println("Total pay: " + totalPay);


    }
}
