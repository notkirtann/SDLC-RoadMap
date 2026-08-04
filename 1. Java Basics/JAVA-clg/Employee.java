package experiment4;

import java.io.Serializable;
import java.util.HashMap;

public class Employee implements Serializable {
    int id;
    String name;
    String department;
    long phoneNumber;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.department = "Not Assigned";
        phoneNumber = 0;
    }

    public Employee(int id, String name, String department) {
        this(id, name);
        this.department = department;
    }

    public Employee(int id, String name, String department, long phoneNumber) {
        this(id, name, department);
        this.phoneNumber = phoneNumber;
    }

    public void printDetails() {
        System.out.println();
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println();
    }

    public static Employee fromString(String empStr) {
        String[] properties = empStr.split("-");
        HashMap<String, String> hmp = new HashMap<>();
        for (String property : properties) {
            String[] lst = property.split(":");
            hmp.put(lst[0], lst[1]);
        }
        Employee emp = new Employee(Integer.parseInt(hmp.get("id")), hmp.get("name"), hmp.get("department"),
                Long.parseLong(hmp.get("phoneNumber")));
        return emp;
    }

    @Override
    public String toString() {
        return "id:" + id + "-" + "name:" + name + "-" + "department:" + department + "-" + "phoneNumber:"
                + phoneNumber;
    }
}