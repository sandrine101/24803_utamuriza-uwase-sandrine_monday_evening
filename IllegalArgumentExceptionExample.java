public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Passing invalid arguments triggers IllegalArgumentException
            setAge(-1);
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException for invalid arguments
            System.out.println("Illegal argument: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}