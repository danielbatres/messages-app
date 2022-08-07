import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("_____________________\n" +
                    "Messages aplication \n" +
                    "[1] Create message \n" +
                    "[2] List message \n" +
                    "[3] Edit message \n" +
                    "[4] Delete message \n" +
                    "[5] Exit \n");

            // Read user option

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Arguments must be a number");
                System.exit(0);
            }

            switch (option) {
                case 1:
                    MessagesService.createMessage();
                    break;
                case 2:
                    MessagesService.listMessages();
                    break;
                case 3:
                    MessagesService.editMessage();
                    break;
                case 4:
                    MessagesService.deleteMessage();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Entered number is invalid");
            }
        } while (option != 5);
    }
}
