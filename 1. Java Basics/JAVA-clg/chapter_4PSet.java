import java.util.Scanner;

public class chapter_4PSet 
{
    public static void main(String[] args) 
    {
        //Question 6
        Scanner sc = new Scanner(System.in);
        String  web = sc.next();
        //String url = web.endsWith(".com");
        if(web.endsWith(".com"))
        {
            System.out.println("its Commercial Wbsite");
        }
        else if(web.endsWith(".org"))
        {
            System.out.println("its Organisation wbsite");
        }
        else if(web.endsWith(".in"))
        {
            System.out.println("Its indian website");
        }
        
        //Question 1
        // int a=10;
        // if(a=11){
        //     System.out.println("Fuck");
        // }
        // else{
        //     System.out.println("bye");
        // }
        

        //Question 2
        // Scanner sc = new Scanner(System.in);
        
        // int Eng = sc.nextInt();
        // int Hindi = sc.nextInt();
        // int Maths = sc.nextInt();
        
        // float Percentage = (Eng + Hindi + Maths)/3.0f ; 

        // if(Maths >=33 && Eng >=33 && Hindi >=33)
        // {
        //     if(Percentage>40)
        //     {
        //         System.out.println("YOu are pass");
        //     }
        //     else
        //     {
        //         System.out.println("Fail Bitch");
        //     }            
        // }
        // else 
        // {
        //     System.out.println("Fail");
        // }

    }
}
