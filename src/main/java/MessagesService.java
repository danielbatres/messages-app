import java.util.Scanner;

public class MessagesService {
    public static void createMessage() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit your message");
        String message = sc.nextLine();

        System.out.println("Your name");
        String name = sc.nextLine();

        MessagesModel register = new MessagesModel();
        register.setMessage(message);
        register.setAuthorMessage(name);

        MessagesDAO.createDBMessage(register);
    }

    public static void listMessages() {
        MessagesDAO.readDBMessages();
    }

    public static void deleteMessage() {

    }

    public static void editMessage() {

    }
}
