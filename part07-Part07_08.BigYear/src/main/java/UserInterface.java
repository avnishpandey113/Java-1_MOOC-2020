
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdWatcher birdWatcher;

    public UserInterface(Scanner scanner, BirdWatcher birdWatcher) {
        this.scanner = scanner;
        this.birdWatcher = birdWatcher;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            processCommand(command, scanner);
        }
    }

    public void processCommand(String command, Scanner scanner) {
        if (command.equalsIgnoreCase("add")) {
            addBird(scanner);
        } else if (command.equalsIgnoreCase("Observation")) {
            addBirdObservation(scanner);
        } else if (command.equalsIgnoreCase("all")) {
            printAllBirds();
        } else if (command.equalsIgnoreCase("one")) {
            System.out.println("In one");
            printOneBird(scanner);
        } else {
            System.out.println("Not a valid command!!");
        }
    }

    public void addBird(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String nameInLatin = scanner.nextLine();
        this.birdWatcher.add(name, nameInLatin);
    }

    public void addBirdObservation(Scanner scanner) {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        this.birdWatcher.addObservation(birdName);
    }

    public void printAllBirds() {
        this.birdWatcher.printAll();
    }
    
    public void printOneBird(Scanner scanner) {
        System.out.println("in printOneBird");
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        this.birdWatcher.printOneBird(birdName);
    }
}
