
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (command.equalsIgnoreCase("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String translationOfWord = this.dictionary.translate(word);
                if (translationOfWord == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(word));
                }

            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
