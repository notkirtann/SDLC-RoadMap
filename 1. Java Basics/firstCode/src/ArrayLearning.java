public class ArrayLearning {
    public static void main(String[] args){
        int[] list = new int[4];
        list[0]=1;
        list[1]=3;
        list[2]=2;
        list[3]=4;

        System.out.println(list.length); // arrays ki properties no need to ()

        //before sort
        for (int i =0;i<list.length;i++) {
            System.out.print(list[i]+" ");
        }
        java.util.Arrays.sort(list);
        //after sort
        for (int i =0;i<list.length;i++) {
            if(i==0) System.out.println();
            System.out.print(list[i]+" ");
        }
    }
}
