package Module_01_Design_Patterns_Principles;
class Singleton {

    // Create a single object
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Method to get the single object
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Hello from Singleton Pattern");
    }
}

public class SingletonPatternDemo {
     public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same.");
        }
    }
}

