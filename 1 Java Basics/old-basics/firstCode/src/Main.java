import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Basics ");
        // byte short int long float double char boolean
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char word =  'a';
        //NON_PRIMITIVE
        String name = "Young GOAT";

        System.out.println("They call me :"+name);
        System.out.println(name.length());

        //new keyword used to create ref type
        String best = new String("Kirtan"); // not compulsory

        //Strings
        System.out.println(name + best);
        // charAt length replace
        best = best.replace('a','4');
        System.out.println(best);
        System.out.println(best.charAt(3));
        System.out.println(name.substring(6,10));


    }
}