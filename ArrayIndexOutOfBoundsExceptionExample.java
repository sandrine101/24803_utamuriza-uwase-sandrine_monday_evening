public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Accessing an array index out of bounds
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException for invalid index access
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}