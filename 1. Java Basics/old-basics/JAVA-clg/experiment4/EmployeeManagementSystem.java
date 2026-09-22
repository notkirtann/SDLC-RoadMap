package experiment4;

import java.util.*;

public class EmployeeManagementSystem {

    // static final String FILENAME = "employees.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, empID;
        long phoneNumber;
        String eName, department;
        DatabaseManager.init();
        do {
            System.out.println("\n\nWelcome\n");
            System.out.println("-------------\n");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Get employee detail");
            System.out.println("4. Delete employee");
            System.out.println("5. Save & Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Enter employee details");
                    System.out.print("ID: ");
                    empID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    eName = sc.nextLine();
                    System.out.print("Department: ");
                    department = sc.nextLine();
                    System.out.print("Phone Number: ");
                    phoneNumber = sc.nextLong();
                    sc.nextLine();
                    DatabaseManager.addEmployee(new Employee(empID, eName, department, phoneNumber));
                    System.out.println("\nAdded employee successfully\n");
                    break;
                case 2:
                    DatabaseManager.printEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee id: ");
                    empID = sc.nextInt();
                    Employee emp = DatabaseManager.getEmployee(empID);
                    if (emp.id == -1)
                        System.out.println("\nEmployee not found");
                    else
                        emp.printDetails();
                    break;
                case 4:
                    System.out.print("Enter employee id: ");
                    empID = sc.nextInt();
                    int res = DatabaseManager.deleteEmployee(empID);
                    if (res == 0)
                        System.out.println("\nEmployee record deleted");
                    else
                        System.out.println("\nEmployee not found");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    DatabaseManager.save();
                    DatabaseManager.close();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (choice != 5);
        sc.close();
    }
}