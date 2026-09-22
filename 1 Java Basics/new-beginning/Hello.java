/**
 * Hello
 */
public class Hello {

  public static void main(String[] args) {
    String a = "mai kya namaste aunty ji";
    System.out.println("Hello Java bro! here we go again");
    System.out.println(3 + 4);
    System.out.println(a);


    long numLong = 2345l;
    System.out.println(numLong);

    float num = 1.2345f;
    System.out.println(num);

    double num2 = 0.21547123654;
    System.out.println(num2);

    char k = 'K';
    System.out.println(k);

    boolean sahi =true;
    System.out.println(sahi);

    int floatConve = (int)num;
    System.out.println(floatConve);


    String result = sahi==false ? "Aaa yeahh" : "oh no no no";
    System.out.println(result);

    int jersey = 10;
    switch (jersey) {
      case 7:
        System.out.println("Siuuuuuuuuuuuu GOAT");
        break;
      case 10:
        System.out.println("Lode ka messi mere");  
        break;
      default:
        System.out.println("Good player but cant be ronlado");
        break;
    }

  }
}