import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/messages_app?serverTimezone=UTC",
                    "root",
                    "");

        } catch (SQLException e) {
            System.out.println("error " + e);
        }

        return connection;
    }
}
