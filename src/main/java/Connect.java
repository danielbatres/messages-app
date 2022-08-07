import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connection singletonConnection;

    public static Connection getConnection() {

        if (singletonConnection == null) {
            try {
                singletonConnection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/messages_app?serverTimezone=UTC",
                        "root",
                        "");

            } catch (SQLException e) {
                System.out.println("error " + e);
            }
        }

        return singletonConnection;
    }
}
