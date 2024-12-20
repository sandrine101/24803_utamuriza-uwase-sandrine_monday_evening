import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to open a non-existent file

            FileReader file = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            // Handling the FileNotFoundException when the file is missing
            System.out.println("File not found: " + e.getMessage());
        }
    }
}