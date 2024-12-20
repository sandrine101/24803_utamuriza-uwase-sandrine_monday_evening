public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that doesn't exist

            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException for missing classes
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}