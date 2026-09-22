public class Chapter_7PSet {
//Question1
    static void MTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+ i +" = " + n*i);
        }
    }
//Question 2
    static void Pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
            System.out.print("\n");
        } 
    }
//Question 3
    static int sumRec(int n)
    {
        int sum=0;
        if(n==1)
        {
            return 1;
        }
        sum = n + sumRec(n-1);
        return sum;

    }
//Question 4
    static void PatternR(int a)
    {
        for(int i=a;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//Question 6
    static float Average(int b,int...a )
    {
        float sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum +a[i];
        }
        return (sum + b) / (a.length+1);
    }

//Question 8
    static void pattern1_rec(int a)
    {
        if(a==0)
        {
            return;
        }
        pattern1_rec(a-1);
        for(int i= 1;i<=a;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

//QUESTION 7 - WRONG
    static void pattern2_rec(int a)
    {
        if(a>0)
        {
            for(int i=1;i<=a;i++)
            {
                System.out.print("* ");
            }
        }
        System.out.println();
        pattern2_rec(a-1);
    }
    
    public static void main(String[] args) {
        // MTable(3);
        // int c = sumRec(5);
        // System.out.println(c);
        // Pattern(6);
        // PatternR(5);
        // System.out.println(Average(98,87,89,87,67,87));
        pattern1_rec(5);
        //pattern2_rec(6);
    } 
}
