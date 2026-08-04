import java.util.*;
class PBLJ1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int[] nos = { 141, 147, 149 };
        String[] name = { "Ronaldo", "Messi","Neymar" };
        String[] joinDates = { "12 Jan 2002", "26 Dec 2003","21 Nov 2011" };
        char[] desigCodes = { 'A', 'B','C'};
        String[] depart = { "Management", "AIT CSE","DSW" };
        int[] basicSals = { 50000, 55000,50760 };
        int[] hras = { 30000, 15000, 20000 };
        int[] das = { 9000, 11000, 17000 };

        int indexNo = 0;
        System.out.print("Enter Employee Number to print details: ");
        int empNo = scan.nextInt();
        while (indexNo < nos.length && nos[indexNo] != empNo) {
            indexNo++;
        }

        int grossSal = basicSals[indexNo] + hras[indexNo] + das[indexNo];
        double netSal = grossSal - grossSal * 0.15;
        System.out.println("Emp No: " + nos[indexNo]);
        System.out.println("Name: " + name[indexNo]);
        System.out.println("Joining Date of Employee: " + joinDates[indexNo]);
        System.out.println("Department of Employee: " + depart[indexNo]);
        System.out.println("Designation Code: " + desigCodes[indexNo]);
        System.out.println("Basic Sal: " + basicSals[indexNo]);
        System.out.println("Net Sal: " + netSal);
        scan.close();
    }
}
