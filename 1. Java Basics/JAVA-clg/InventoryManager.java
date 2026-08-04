package experiment8;

import java.sql.*;
import java.util.Scanner;

public class InventoryManager {

    static Connection con;
    static final String dbName = "test";
    static final String tableName = "inventory";

    static int init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, "root", "26732");
            return 0;
        } catch (Exception e) {
            System.out.println("Cannot establish connection to database");
            System.out.println("Exception: " + e.toString());
            System.exit(-1);
            return -1;
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        String cname, pname;
        int choice = 0, quantity;
        do {
            System.out.println("1. Add record");
            System.out.println("2. Print records");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch (choice) {
                case 1:
                    System.out.print("Customer name: ");
                    cname = sc.nextLine();
                    System.out.print("Product name: ");
                    pname = sc.nextLine();
                    System.out.print("Quantity: ");
                    quantity = sc.nextInt();
                    sc.nextLine();
                    try {
                        PreparedStatement ps = con.prepareStatement("insert into " + tableName + " values(?,?,?)");
                        ps.setString(1, cname);
                        ps.setString(2, pname);
                        ps.setInt(3, quantity);
                        ps.executeUpdate();
                    } catch (Exception e) {
                        System.out.println("Cannot add record to database");
                        System.out.println("Exception: " + e.toString());
                    }
                    break;
                case 2:
                    try {
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from " + tableName);
                        while (rs.next()) {
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                        }
                    } catch (Exception e) {
                        System.out.println("Cannot retrieve records from database");
                        System.out.println("Exception: " + e.toString());
                    }

                default:
                    break;
            }
            System.out.println("\n");
        } while (choice != 3);
        sc.close();
    }
}
