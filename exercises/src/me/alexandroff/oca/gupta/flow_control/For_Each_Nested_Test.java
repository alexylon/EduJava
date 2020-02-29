package me.alexandroff.oca.gupta.flow_control;

import java.util.ArrayList;

public class For_Each_Nested_Test {

    public static void main(String[] args) {

        // A nested loop executes all its iterations
        // for each single iteration of its immediate outer loop
        ArrayList<String> exams = new ArrayList<String>();
        exams.add("Java");
        exams.add("Oracle");
        ArrayList<String> levels = new ArrayList<String>();
        levels.add("Basic");
        levels.add("Advanced");
        ArrayList<String> grades = new ArrayList<String>();
        grades.add("Pass");
        grades.add("Fail");
        for (String exam : exams)
            for (String level : levels)
                for (String grade : grades)
                    System.out.println(exam + ":" + level + ":" + grade);
    }
}
