import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection() {
        try {
            String dbUrl = System.getenv("DB_URL");
            String dbUser = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");
            return DriverManager.getConnection(dbUrl, dbUser, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
