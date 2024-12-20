public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Null reference access triggers NullPointerException
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handling NullPointerException for null object access
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}