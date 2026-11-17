class A extends Object{ //bydefault extends
  public A(){
    System.out.println("A");
  }
  public A(int n){
    this(); // will print both A contructor
    System.out.println("A para");
  }
}

class B extends A{
  public B(){
    super(7); // its there even we dont right like a john cena
    System.out.println("B");
  }
  public B(int n){
    //super(); // will call default para if we dont add parmeter 
    this();
    System.out.println("B para");
  }
}

public class SuperAndThis {
  public static void main(String[] args) {
    B obj = new B(9);
  }  
}
