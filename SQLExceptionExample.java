import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Connecting to a database and executing an invalid SQL query
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            // Handling SQLException for database errors
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}