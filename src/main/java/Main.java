import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connect connection = new Connect();

        try  {
            Connection cnt = connection.getConnection();
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
    }
}
