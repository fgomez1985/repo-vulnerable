import java.sql.*;

// Ejemplo vulnerable: SQL Injection
public class SQLInjectionExample {
    public static void main(String[] args) throws Exception {
        String userInput = args.length > 0 ? args[0] : "1";
        String query = "SELECT * FROM users WHERE id = " + userInput;
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        conn.close();
    }
}
