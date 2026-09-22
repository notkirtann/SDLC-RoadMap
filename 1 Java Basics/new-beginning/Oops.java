/**
 * Calce
 * 
 */
class Calce {
  public int add(int num1, int num2) {
    System.out.println("in add  class");
    int result = num1 + num2;
    return result;
  }
}

class methodOverloading {
  public int multiply(int n1, int n2) {
    return n1 * n2;
  }

  public int multiply(int n1, int n2, int n3) {
    return n1 * n2 * n3;
  }
}

class Encapsulation {
  private int age;
  private String name;

  // public void setAge(int assignUmar){
  // age = assignUmar;
  // }
  // public void setName(String assingNaam){
  // name = assingNaam;
  // }

  // public int getAge(){
  // return age;
  // }

  // public String getName(){
  // return name;
  // }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class LearningConstructor {
  private String playerName;
  private int playerJersey;
  private String teamName;

  public LearningConstructor(String playerName, int playerJersey, String teamName) {
    this.playerName = playerName;
    this.playerJersey = playerJersey;
    this.teamName = teamName;
  }

    public String getPlayerName() {
    return playerName;
  }

  public int getPlayerJersey() {
    return playerJersey;
  }

  public String getTeamName() {
    return teamName;
  }

}

// !main class for executing java class and methods
public class Oops {
  public static void main(String[] args) {
    Calce add = new Calce(); // new objects.
    System.out.println(add.add(2, 3));

    methodOverloading eg1 = new methodOverloading();
    int ans1 = eg1.multiply(2, 3);
    int ans2 = eg1.multiply(2, 2, 4);
    System.out.println(ans1 + " and " + ans2);

    Encapsulation ex1 = new Encapsulation();
    ex1.setAge(7);
    ex1.setName("Waymaker");
    int umar = ex1.getAge();
    String naam = ex1.getName();
    System.out.println("Age: " + umar + " Name : " + naam);

    LearningConstructor club = new LearningConstructor(" Sergio Ramos, ", 4, "Real Madrid");
    System.out.print(club.getPlayerJersey()+club.getPlayerName()+club.getTeamName());
  }
}
