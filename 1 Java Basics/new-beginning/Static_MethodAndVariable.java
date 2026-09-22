import java.util.*;

class Counter {
    // 1. Static Variable: Shared across all objects
    public static int objectCount = 0;

    // Instance Variable: Each object has its own separate copy
    public String objectName;

    // Constructor
    public Counter(String name) {
        this.objectName = name;
        // Increment the shared count every time a new object is created
        objectCount++;
    }

    // 2. Static Method: Can be called without creating an object
    public static void displayTotalObjects() {
        // Can directly access static variables
        System.out.println("Total objects created so far: " + objectCount);

        // Compilation Error if uncommented: Static methods cannot access instance
        // variables directly
        // System.out.println("Object Name: " + objectName);
    }
}

class DatabaseConfig {
    public static String dbUrl;
    public static List<String> supportedBrowsers = new ArrayList<>();

    // 1. Static Block: Runs ONCE when the class is loaded
    static {
        System.out.println("--- Static Block Executed: Initializing variables ---");
        dbUrl = "jdbc:mysql://localhost:3306/my_database";

        // Useful for complex initializations like filling a collection
        supportedBrowsers.add("Chrome");
        supportedBrowsers.add("Firefox");
        supportedBrowsers.add("Edge");
    }

    // Constructor: Runs every time a new object is created
    public DatabaseConfig() {
        System.out.println("Constructor Executed: Object created.");
    }
}

public class Static_MethodAndVariable {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Main method started.");

        // Accessing a static method BEFORE creating any objects
        // Syntax: ClassName.methodName()
        Counter.displayTotalObjects(); // Output: 0

        // Creating instances of Counter
        Counter obj1 = new Counter("First Object");
        Counter obj2 = new Counter("Second Object");
        Counter obj3 = new Counter("Third Object");

        // Accessing the static method again after object creation
        Counter.displayTotalObjects(); // Output: 3

        // Demonstrating shared behavior of a static variable
        // Although accessed via different instances, they point to the exact same value
        System.out.println("obj1 sees total count as: " + obj1.objectCount); // Output: 3
        System.out.println("obj2 sees total count as: " + obj2.objectCount); // Output: 3

        // Recommended practice is always to use the Class name:
        System.out.println("Class-level access: " + Counter.objectCount); // Output: 3

        // Accessing a static variable triggers the class loading and the static block
        System.out.println("Database URL: " + DatabaseConfig.dbUrl);

        System.out.println("About to load class via Class.forName()...");
        Class.forName("DatabaseConfig");
        System.out.println("Class.forName() finished.");

        // Creating objects to see when the constructor runs vs the static block
        DatabaseConfig config1 = new DatabaseConfig();
        DatabaseConfig config2 = new DatabaseConfig();

    }
}
