package experiment1;

import java.util.Scanner;

public class EmployeeManager {
    private static Scanner sc;
    private static int count;
    private static int[] nos;
    private static String[] names;
    private static String[] joiningDates;
    private static char[] designationCodes;
    private static String[] departments;
    private static int[] basicSals;
    private static int[] hras;
    private static int[] das;

    public static void init(int size) {
        sc = new Scanner(System.in);
        count = 0;
        nos = new int[size];
        names = new String[size];
        joiningDates = new String[size];
        designationCodes = new char[size];
        departments = new String[size];
        basicSals = new int[size];
        hras = new int[size];
        das = new int[size];
    }

    public static void addEmployee() {
        System.out.println("Enter employee details\n");
        System.out.print("No: ");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Joining Date: ");
        String jDate = sc.nextLine();
        System.out.print("Department: ");
        String department = sc.nextLine();
        System.out.print("Designation Code: ");
        char dCode = sc.next().charAt(0);
        System.out.print("Basic: ");
        int basic = sc.nextInt();
        System.out.print("HRA: ");
        int hra = sc.nextInt();
        System.out.print("DA: ");
        int da = sc.nextInt();
        System.out.println();
        nos[count] = no;
        names[count] = name;
        joiningDates[count] = jDate;
        departments[count] = department;
        designationCodes[count] = dCode;
        basicSals[count] = basic;
        hras[count] = hra;
        das[count] = da;
        count++;
    }

    public static double calculateIncomeTax(int grossSal) {
        return grossSal * 0.15;
    }

    public static void printEmployeeDetails(int empNo) {
        int index = 0;
        while (index < count && nos[index] != empNo) {
            index++;
        }
        int grossSal = basicSals[index] + hras[index] + das[index];
        double netSal = grossSal - calculateIncomeTax(grossSal);
        System.out.println("Emp No: " + nos[index]);
        System.out.println("Name: " + names[index]);
        System.out.println("Joining Date: " + joiningDates[index]);
        System.out.println("Department: " + departments[index]);
        System.out.println("Designation Code: " + designationCodes[index]);
        System.out.println("Basic Sal: " + basicSals[index]);
        System.out.println("Net Sal: " + netSal);

    }

    public static void main(String[] args) {
        init(50);
        addEmployee();
        addEmployee();
        System.out.print("Enter employee no to get details: ");
        int no = sc.nextInt();
        printEmployeeDetails(no);

    }

}

class EmployeeM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nos = { 123, 546 };
        String[] names = { "Aditya", "Ankur" };
        String[] joiningDates = { "12 Jan 2023", "26 Dec 2020" };
        char[] designationCodes = { 'M', 'M' };
        String[] departments = { "Management", "Management" };
        int[] basicSals = { 100000, 900000 };
        int[] hras = { 20000, 40000 };
        int[] das = { 10000, 20000 };

        int index = 0;
        System.out.print("Enter employee no to print details: ");
        int empNo = sc.nextInt();
        while (index < nos.length && nos[index] != empNo) {
            index++;
        }

        int grossSal = basicSals[index] + hras[index] + das[index];
        double netSal = grossSal - grossSal * 0.15;
        System.out.println("Emp No: " + nos[index]);
        System.out.println("Name: " + names[index]);
        System.out.println("Joining Date: " + joiningDates[index]);
        System.out.println("Department: " + departments[index]);
        System.out.println("Designation Code: " + designationCodes[index]);
        System.out.println("Basic Sal: " + basicSals[index]);
        System.out.println("Net Sal: " + netSal);
        sc.close();
    }
}