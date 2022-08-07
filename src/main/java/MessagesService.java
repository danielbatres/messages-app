import java.util.Scanner;

public class MessagesService {
    private static Scanner sc = new Scanner(System.in);

    public static void createMessage() {
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
        System.out.println("Enter the id of the message to delete");
        int idMessage = 0;

        try {
            idMessage = sc.nextInt();
        } catch (Exception e) {
            System.out.println("An integer number was expected");
            System.exit(0);
        }

        MessagesDAO.deleteDBMessages(idMessage);
    }

    public static void editMessage() {
        System.out.println("Enter your new message");
        String message = sc.nextLine();

        System.out.println("Enter id message to edit");

        int idMessage = 0;

        try {
            idMessage = sc.nextInt();
        } catch (Exception e) {
            System.out.println("An integer number was expected");
            System.exit(0);
        }

        MessagesModel update = new MessagesModel();

        update.setIdMessage(idMessage);
        update.setMessage(message);

        MessagesDAO.updateDBMessage(update);
    }
}
