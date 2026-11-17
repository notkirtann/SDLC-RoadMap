import helpingfile.*;
public class Oops_2 {
  public static void main(String[] args) {
    AdvancedProgrammerCalculator calc = new AdvancedProgrammerCalculator();


//multilevel inhertance    
    // 1. Level 1: Inherited from BasicCalculator (Grandparent)
    System.out.println("Addition (12 + 8): " + calc.add(12, 8));
    // 2. Level 2: Inherited from ScientificCalculator (Parent)
    System.out.println("Power (2^5): " + calc.power(2, 5));
    // 3. Level 3: Unique to AdvancedProgrammerCalculator (Child)
    System.out.println("Decimal 45 to Binary: " + calc.toBinary(45));
    System.out.println("Decimal 255 to Hex: " + calc.toHex(255));

    MethodOveridingA obj = new MethodOveridingA();
    obj.show();
    obj.config();

    MethodOveridingA obj2 = new MethodOveridingB();
    obj2.show();
    obj2.config();
  }
}
