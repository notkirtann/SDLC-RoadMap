package experiment4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DatabaseManager {
    public static ArrayList<Employee> list;
    private static final String dbPath = "employeeDB.txt";
    private static FileReader fR;
    private static FileWriter fW;

    public static int init() {
        list = new ArrayList<Employee>();
        File fl = new File(dbPath);
        if (!(fl.isFile() && fl.canRead())) {
            try {
                fl.createNewFile();
                System.out.println("Database file not found");
                System.out.println("New database created\n\n");

            } catch (Exception e) {
                System.out.println("Cannot create the database file\n");
            }
        }
        try {
            fR = new FileReader(dbPath);
            fetch();
            fW = new FileWriter(dbPath);
            return 0;
        } catch (Exception e) {

            System.out.println("An error occured while accesing the database\n");
            return -1;
        }
    }

    public static int close() {
        try {
            fR.close();
            fW.close();
            return 0;
        } catch (Exception e) {
            System.out.println("An error occured while closing the database\n");
            return -1;
        }
    }

    public static void addEmployee(Employee employee) {
        list.add(employee);
    }

    public static Employee getEmployee(int empID) {
        for (Employee employee : list) {
            if (employee == null)
                break;
            if (employee.id == empID) {
                return employee;
            }
        }
        return new Employee(-1, "Record not found");
    }

    public static int deleteEmployee(int empID) {
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            if (list.get(i).id == empID) {
                list.remove(i);
                return 0;
            }
        }
        return 1;
    }

    public static void printEmployees() {
        if (list.size() == 0) {
            System.out.println("No employee record present\n");
            return;
        }
        System.out.println("Employee Details\n");
        for (Employee employee : list) {
            if (employee == null)
                return;
            employee.printDetails();
        }
    }

    public static int fetch() {
        StringBuffer sBuffer = new StringBuffer();
        int charac = 0;
        try {
            while ((charac = fR.read()) != -1) {
                sBuffer.append((char) charac);
            }
            String[] empListStr = sBuffer.toString().split("\n");
            for (String empStr : empListStr) {
                if (empStr == null || empStr == "")
                    break;
                list.add(Employee.fromString(empStr));
            }
        } catch (Exception e) {
            System.out.println(
                    "An error occured while fetching data from the database: " + e.getClass().toString() + "\n");
            return -1;
        }
        return 0;

    }

    public static int save() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : list) {
            stringBuilder.append(employee.toString() + '\n');
        }
        try {
            fW.write(stringBuilder.toString());
            return 0;
        } catch (Exception e) {
            System.out.println("An error occured while saving changes in the database\n");
            return -1;
        }
    }
}
