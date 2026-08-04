package experiment3;

import java.util.Scanner;

public class MainClass {
        public static void main(String[] args) {
                int tenureFD, tenureRD, tenureSB, age;
                double amountFD, monthlyAmountRD, amountSB;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your age: ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("\nPlease enter tenure of deposit in months\n");
                System.out.print("Enter FD tenure: ");
                tenureFD = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter RD tenure: ");
                tenureRD = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter SB tenure: ");
                tenureSB = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter FD deposit: ");
                amountFD = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter RD monthly deposit: ");
                monthlyAmountRD = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter SB deposit: ");
                amountSB = sc.nextInt();
                sc.nextLine();
                FDAccount fd = new FDAccount(amountFD, tenureFD, age);
                RDAccount rd = new RDAccount(monthlyAmountRD, tenureRD, age);
                SBAccount sb = new SBAccount(amountSB, tenureSB, age);
                System.out.println("FD Amount at maturity: " + fd.calculateMaturityAmount() + " (Interest: "
                                + fd.calculateInterestAmount() + ")");
                System.out.println("RD Amount at maturity: " + rd.calculateMaturityAmount() + " (Interest: "
                                + rd.calculateInterestAmount() + ")");
                System.out.println("SB Amount: " + sb.calculateMaturityAmount() + " (Interest: "
                                + sb.calculateInterestAmount() + ")");
                sc.close();
        }
}
