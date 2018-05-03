package JFC;

import java.util.Objects;

public class Employee {

    private String name;
    private int id;

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
