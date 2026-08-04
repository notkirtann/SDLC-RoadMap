public class CHW_13 {
    public static void main(String[] args) {
        String name ="   Kirtan Nahar    ";
        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.trim());

        System.out.println(name.substring(3,5));
        //space ko bhi index me consider krta hai 
        //end index included nhi rehta hai

        System.out.println(name.replace('a','s'));
        System.out.println(name.replace("har","SIUUU"));


    }
}
