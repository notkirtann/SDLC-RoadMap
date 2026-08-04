import java.util.Scanner;

public class Excercise1 
{
    public static void main(String[] args)
    {
        Scanner Marks = new Scanner(System.in);
            System.out.println("Enter the Marks of S1");
                byte S1 = Marks.nextByte();
            System.out.println("Enter the Marks of S2");
                byte S2 = Marks.nextByte();
            System.out.println("Enter the Marks of S3");
                byte S3 = Marks.nextByte();
            System.out.println("Enter the Marks of S4");
                byte S4 = Marks.nextByte();
            System.out.println("Enter the Marks of S5");
                byte S5 = Marks.nextByte();

        System.out.print("Your Percentage are : ");
        double Percentage = (S1+S2+S3+S4+S5)/5.0;
        System.out.println(Percentage);
    }
}
