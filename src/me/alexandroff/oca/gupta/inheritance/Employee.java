package me.alexandroff.oca.gupta.inheritance;

public class Employee {

    String name;
    String address;
    String phoneNumber;
    float experience;
}

interface Interviewer {
    public void conductInterview();
}

class HRExecutive extends Employee implements Interviewer {
    String[] specialization;

    public void conductInterview() {

        System.out.println("HRExecutive - conducting interview");
    }
}

class Office {
    public static void main(String args[]) {
        HRExecutive hr = new HRExecutive();
        Employee em = new HRExecutive();
        Interviewer in = new HRExecutive();
        // HRExecutive hr2 = new Employee(); - Won't compile. The object must be the child
        // Interviewer in2 = new Interviewer(); - Interfaces cannot be instantiated

        hr.specialization = new String[]{"Staffing"};
        System.out.println(hr.specialization[0]);
        hr.name = "Alexander Alexandroff";
        System.out.println(hr.name);
        hr.conductInterview();
        System.out.println();

        // em.specialization = new String[]{"Programming"}; - Not allowed
        ((HRExecutive) em).specialization = new String[]{"Programming"}; // OK
        System.out.println(((HRExecutive) em).specialization[0]);
        em.address = "Browning str";
        System.out.println(em.address);
        // em.conductInterview(); - Not allowed
        ((HRExecutive) em).conductInterview();
        in.conductInterview();
        System.out.println();

        ((HRExecutive) in).specialization = new String[]{"Coding"};
    }
}
