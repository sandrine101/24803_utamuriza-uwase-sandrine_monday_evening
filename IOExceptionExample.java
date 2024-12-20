import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to write to a file in a directory that doesn't exist
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // Handling the IOException when file writing fails
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

