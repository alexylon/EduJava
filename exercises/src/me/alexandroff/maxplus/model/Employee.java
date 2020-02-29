package me.alexandroff.maxplus.model;

public class Employee {

    private String fullName;
    private Company company;
    private int emp_number;
    private String position;
    private int phone;
    private String address;
    private double salary;
    private String working_time;


    public Employee(String fullName, Company company, int emp_number,
                    String position, double salary, String working_time) {
        this.fullName = fullName;
        this.company = company;
        this.emp_number = emp_number;
        this.position = position;
        this.salary = salary;
        this.working_time = working_time;
        this.company.getName();

        Company.setEmp_count(Company.getEmp_count() + 1);

        if ((Company.getMinSalaryEmp() != null
                && Company.getMinSalaryEmp().getSalary() > salary)
                || Company.getMinSalaryEmp() == null) {
            Company.setMinSalaryEmp(this);
        }

        Employee maxSalaryEmp = Company.getMaxSalaryEmp();
        if ((maxSalaryEmp != null
                && maxSalaryEmp.getSalary() < salary)
                || maxSalaryEmp == null) {
            Company.setMaxSalaryEmp(this);
        }
    }

    public String toString() {
        return "Name: " + this.fullName + "\nCompany: " + this.company
                + "\nNumber: " + this.emp_number + "\nPosition: " + this.position
                + "\nSalary: " + this.salary + "\nWorking me.alexandroff.time: " + this.working_time;
    }

    public static void main(String[] args) {
        Company company1 = new Company("KAME", 831319228, "Vladimir Karamfilov", "Bansko shose 23");
        Company company2 = new Company("Institut", 638623906, "Proff. Kantardzhiev", "Park Zaimov");
        Employee employee1 = new Employee("Alexander Alexandrov", company1, 4021, "Product Manager", 1600, "Full-me.alexandroff.time");
        Employee employee2 = new Employee("Ekaterina Alexandrova", company2, 4452, "Microbiologist", 600, "Full-me.alexandroff.time");
        System.out.println(employee1);
        System.out.println(employee2);
    }

    public Employee(String fullName, int phone, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(int emp_number) {
        this.emp_number = emp_number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorking_time() {
        return working_time;
    }

    public void setWorking_time(String working_time) {
        this.working_time = working_time;
    }
}
