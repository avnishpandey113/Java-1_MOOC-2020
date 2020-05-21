
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scannner) {
        this.jokeManager = jokeManager;
        this.scanner = scannner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            addJoke();
        } else if (command.equals("2")) {
            drawJoke();
        } else {
            printJokes();
        }
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
    }

    public void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(jokeManager.drawJoke());
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }

}
