public class Chapter_6PSet {
    public static void main(String[] args) {
        //...................................................................
        //QUESTION 1
        // float[] Siu = new float[5];
        // Siu[0]=1;
        // Siu[1]=2;
        // Siu[2]=3;
        // Siu[3]=4;
        // Siu[4]=5;

        // int i;
        // float sum =0;
        // for(i=0;i<Siu.length;i++)
        // {
        //     sum = sum + Siu[i];
        // }
        // System.out.println(sum);
        //...................................................................
        //QUESTION 2
        // int i, found = 4;
        // int[] Siu = new int[5];
        // Siu[0]=1;
        // Siu[1]=2;
        // Siu[2]=3;
        // Siu[3]=4;
        // Siu[4]=5;

        // for(i=0;i<Siu.length;i++)
        // {
        //     if(Siu[i]==found)
        //     {
        //         System.out.println("Variable found at "+ Siu[i]);
        //     }
        //     else
        //     {
        //         System.out.println("not found at "+Siu[i]);
        //     }
        // }
        //...................................................................
        //QUESTION 4
        // int[][] m1 = {{1,2,3},{4,5,6}};
        // int[][] m2 = {{1,2,3},{4,5,6}};
        
        // int i,j;
        // int[][] m3= new int[2][3];
        // for(i=0;i<m3.length;i++)
        // {
        //     for(j=0;j<m1[i].length;j++)
        //     {
        //         m3[i][j] = m1[i][j]+ m2[i][j];
                
        //     }
        // }

        // for(i=0;i<m3.length;i++)
        // {
        //     for(j=0;j<m1[i].length;j++)
        //     {
        //         System.out.print(m3[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.print("\n");
        // }
        //...................................................................
        //QUESTION 5
        // int[] arr = {1,2,3,4,5};
        // int temp;
        // //int s = ar
        // int l = arr.length;
        // int n = l/2;
        // for(int i=0;i<n;i++)
        // {
        //     temp = arr[i];
        //     arr[i]=arr[l-1-i];
        //     arr[l-1-i]= temp;
        // }
        // for(int i=0;i<l;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        //...................................................................
        //QUESTION 6 and 7
        // int[] arr = {1,2,3,4,5};
        // int max=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>max)
        //     {
        //         max= arr[i];
        //     }
        // }
        // int min = max;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]<min)
        //     {
        //         min = arr[i];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(min);
        //...................................................................
        //QUESTION 8
        int[] arr = {1,2,9,4,5};
        boolean Sorted = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                Sorted = false;
                break;
            }
        }
        System.out.println(Sorted);
    }
}
