package experiment5;

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Float> htb = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String input = sc.next();
            htb.put(input, i * 0.4563f);
            sc.nextLine();
        }
        Enumeration<String> keys = htb.keys();
        System.out.print("Keys of Hashtable: [ ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + ", ");
        }
        System.out.println("]");
        sc.close();
    }
}
