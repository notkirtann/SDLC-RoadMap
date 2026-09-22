import java.util.Scanner;

public class chapter_5PSet {
    
    public static void main(String[] args) 
    {
        
        //Question 5
        System.out.println("QUESTION 5");
        Scanner sc = new Scanner(System.in);
         int numb = sc.nextInt();
         int i,fact=1;
        for(i=1;i<=numb;i++)
        {
           fact=fact*i;
        }
        System.out.println(fact);
        
        //Question 1
        System.out.println("QUESTION 1");
        int l,j;
        int n = sc.nextInt();
        for(l=n;l>0;l--)
        {
            for(j=0;j<l;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Question 3
        System.out.println("QUESTION 3");
        //int t = sc.nextInt();
        int t = 5;
        for(int z=1;z>=10;z++)
        {
            System.out.printf("%d X %d = %d",t,z,t*z);
        }

    }
}