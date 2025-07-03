import java.sql.*;

public class VulnerableApp {
    public static void main(String[] args) {
        String userInput = "'; DROP TABLE users; --";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE name = '" + userInput + "'";
            ResultSet rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();  // Should use logging, not print stack trace
        }
    }
}
