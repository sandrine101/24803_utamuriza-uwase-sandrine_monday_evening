import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("emptyfile.txt"))) {
            while (true) {
                System.out.println(dis.readUTF()); // Reading beyond file contents
            }
        } catch (EOFException e) {
            // Handling EOFException when the end of the file is reached
            System.out.println("Reached the end of the file: " + e.getMessage());
        } catch (IOException e) {
            // Handling other IOExceptions
            System.out.println("IOException: " + e.getMessage());
        }
    }
}