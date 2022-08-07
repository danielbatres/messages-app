import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void createDBMessage(MessagesModel message) {
        try {
            String query = "INSERT INTO `messages` (`message`, `autor_message`) VALUES (?,?);";

            ps = Connect.getConnection().prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthorMessage());
            ps.executeUpdate();

            System.out.println("Message created");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void readDBMessages() {
        try {
            String query = "SELECT * FROM messages";

            ps = Connect.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_message"));
                System.out.println("Message: " + rs.getString("message"));
                System.out.println("Author: " + rs.getString("autor_message"));
                System.out.println("Date: " + rs.getString("date_message") + "\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteDBMessages(int idMessage) {

    }

    public static void updateDBMessage(MessagesModel message) {

    }
}
