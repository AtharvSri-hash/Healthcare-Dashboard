import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            // Force load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/healthcare_dashboard",
                "root",
                "Kavu@2004V"   // your password
            );

            System.out.println("Connected to MySQL!");
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}