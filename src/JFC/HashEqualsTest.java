package JFC;


import java.util.HashMap;
import java.util.Map;

public class HashEqualsTest {

    public static void main(String[] args) {

        Map<Employee, Integer> emps = new HashMap<>();

        emps.put(new Employee(1, "Ivan"), 222);
    }
}
