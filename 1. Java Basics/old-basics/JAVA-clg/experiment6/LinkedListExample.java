package experiment6;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    static LinkedList<String> list;

    static void insert(String inp) {
        list.add(inp);
    }

    static void delete(String inp) {
        list.remove(inp);
    }

    static void search(String inp) {
        int index = list.indexOf(inp);
        if (index < 0)
            System.out.println("Element not found");
        else
            System.out.println(inp + " found at index " + index);
    }

    static void display() {
        list.forEach((element) -> System.out.print(element + " -> "));
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list = new LinkedList<>();
        String value;
        int choice = 0;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter string: ");
                    value = sc.nextLine();
                    insert(value);
                    break;
                case 2:
                    System.out.print("Enter string: ");
                    value = sc.nextLine();
                    delete(value);
                    break;
                case 3:
                    System.out.print("Enter string: ");
                    value = sc.nextLine();
                    search(value);
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
