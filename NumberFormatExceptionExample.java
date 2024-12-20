public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Converting invalid string format to number
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            // Handling NumberFormatException for invalid numeric conversions
            System.out.println("Number format exception: " + e.getMessage());
        }
    }
}
