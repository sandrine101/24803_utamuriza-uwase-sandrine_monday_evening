public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Division by zero, which triggers ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handling ArithmeticException for invalid arithmetic operations
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
}
