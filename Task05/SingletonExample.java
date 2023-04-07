package task055;

public class SingletonExample {
    private static SingletonExample instance;
    
    private SingletonExample() {
        // private constructor
    }
    
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    
    // other methods and properties
}
