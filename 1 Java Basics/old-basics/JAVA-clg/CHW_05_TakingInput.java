import java.util.Scanner;

public class CHW_05_TakingInput{
   
    public static void main(String[] args){
        // System.out.println("Taking output from user");
         Scanner sc = new Scanner(System.in);
        // System.out.println("ENter the nuber 1");
        // int a = sc.nextInt();
        // System.out.println("ENter the nuber 2");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("The Sum of bith the numbers is :");
        // System.out.println(sum); 
        // System.out.println("-----------------------");
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // System.out.println("-------------------------");
        
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("-------------------------");
        sc.nextLine();
        String strx = sc.nextLine();
    
        System.out.println(strx);
    }
}