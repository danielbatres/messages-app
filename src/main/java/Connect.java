import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/messages_app?serverTimezone=UTC",
                    "root",
                    "");

            if (connection != null)  {
                System.out.println("Succesful connection");
            }
        } catch (SQLException e) {
            System.out.println("error " + e);
        }

        return connection;
    }
}
