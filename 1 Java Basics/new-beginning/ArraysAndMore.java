
public class ArraysAndMore {
  public static void main(String[] args) {
    
    // jagged array demo code for java
    int array[][] = new int[4][];

    array[0] = new int[3];
    array[1] = new int[2];
    array[2] = new int[4];

    //objects
    Student s1 = new Student();
    s1.rollno= 47;
    s1.name = "Kirtan";
    s1.title = "Young GOAT aka Waymaker";
    
    Student s2 = new Student();
    s2.rollno= 7;
    s2.name = "Cristiano";
    s2.title = "GOAT";
    
    Student s3 = new Student();
    s3.rollno= 10;
    s3.name = "Messi";
    s3.title = "Legend";

    Student students[] = new Student[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.print(students[i].rollno+" ");
      System.out.print(students[i].title+" ");
      System.out.println(students[i].name);
    }

    // FOR EACH LOOP
    for (Student s : students) {
      System.out.print(s.rollno+" ");
      System.out.print(s.title+" ");
      System.out.println(s.name);
    }

    //StringBuffer and StringBuilder
   
        StringBuilder sb = new StringBuilder("Hello");
        // Modifying the existing object
        sb.append(" World"); 
        System.out.println(sb); // Output: Hello World
        sb.insert(5, ",");
        System.out.println(sb); // Output: Hello, World
        sb.reverse();
        System.out.println(sb); // Output: dlroW ,olleH


        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println(sbf); // Output: Java Programming


  }
}

class Student {
    int rollno;
    String name;
    String title;
}
