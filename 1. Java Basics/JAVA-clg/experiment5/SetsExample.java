package experiment5;

import java.util.*;

public class SetsExample {
    public static void main(String[] args) {
        Set<String> st = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of strings to enter: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            String inp = sc.next();
            sc.nextLine();
            boolean res = st.add(inp);
            if (res)
                System.out.println("String added to set");
            else
                System.out.println("Duplicate entry not allowed");
        }
        Iterator<String> itr = st.iterator();
        System.out.print("[ ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println("]");
        sc.close();
    }
}
