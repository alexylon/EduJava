package model;

public class Company {

    private String name;
    private int emp_counter;
    private int eik;
    private String manager;
    private String address;

    private static int emp_count;
    private static Employee minSalaryEmp;
    private static Employee maxSalaryEmp;
    private static int fullTime_count;
    private static int partTime_count;

    public Company(String name, int emp_counter, String manager) {
        this.name = name;
        this.emp_counter = emp_counter;
        this.manager = manager;
    }

    public Company(String name, int eik, String manager, String address) {
        this.name = name;
        this.eik = eik;
        this.manager = manager;
        this.address = address;
    }

    public String toString() {
        return this.name + ", " + "EIK: " + this.eik + ", Number of employees: "
                + emp_count + ", Min. salary: " + minSalaryEmp.getSalary();
    }

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_counter() {
        return emp_counter;
    }

    public void setEmp_counter(int emp_counter) {
        this.emp_counter = emp_counter;
    }

    public int getEik() {
        return eik;
    }

    public void setEik(int eik) {
        this.eik = eik;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getEmp_count() {
        return emp_count;
    }

    public static void setEmp_count(int emp_count) {
        Company.emp_count = emp_count;
    }

    public static Employee getMinSalaryEmp() {
        return minSalaryEmp;
    }

    public static void setMinSalaryEmp(Employee minSalaryEmp) {
        Company.minSalaryEmp = minSalaryEmp;
    }

    public static Employee getMaxSalaryEmp() {
        return maxSalaryEmp;
    }

    public static void setMaxSalaryEmp(Employee maxSalaryEmp) {
        Company.maxSalaryEmp = maxSalaryEmp;
    }

    public static int getFullTime_count() {
        return fullTime_count;
    }

    public static void setFullTime_count(int fullTime_count) {
        Company.fullTime_count = fullTime_count;
    }

    public static int getPartTime_count() {
        return partTime_count;
    }

    public static void setPartTime_count(int partTime_count) {
        Company.partTime_count = partTime_count;
    }
}
