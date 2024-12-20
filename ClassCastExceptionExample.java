public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Invalid type casting triggers ClassCastException
            Object obj = "String";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            // Handling ClassCastException for incompatible type casts
            System.out.println("Class cast exception: " + e.getMessage());
        }
    }
}