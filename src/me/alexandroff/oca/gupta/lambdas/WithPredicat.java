package me.alexandroff.oca.gupta.lambdas;

import java.util.ArrayList;

public class WithPredicat {

    public static void main(String[] args) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.00);
        ArrayList<Emp> empArrList = new ArrayList<>();
        empArrList.add(e1);
        empArrList.add(e2);
        empArrList.add(e3);
        empArrList.add(e4);
        for (Emp e : empArrList)
            System.out.println(e);
        System.out.println("After deletion..");
        empArrList.removeIf(e -> e.getName().startsWith("S"));
        for (Emp e : empArrList)
            System.out.println(e);
    }
}
