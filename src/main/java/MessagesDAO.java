import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessagesDAO {
    public static void createDBMessage(MessagesModel message) {
        Connect.getConnection();
        PreparedStatement ps = null;

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

    }

    public static void deleteDBMessages(int idMessage) {

    }

    public static void updateDBMessage(MessagesModel message) {

    }
}
