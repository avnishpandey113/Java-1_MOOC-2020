
import java.util.Scanner;

public class UserInterface {

    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("First: " + this.container1.toString());
        System.out.println("Second: " + this.container2.toString());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            processCommand(command, amount);
            System.out.println("First: " + this.container1.toString());
            System.out.println("Second: " + this.container2.toString());
        }
    }

    public void processCommand(String command, int amount) {
        if (command.equalsIgnoreCase("add")) {
            add(amount);
        } else if (command.equalsIgnoreCase("move")) {
            move(amount);
        } else if (command.equalsIgnoreCase("remove")) {
            remove(amount);
        }
    }

    public void add(int amount) {
        this.container1.add(amount);
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > this.container1.contains()) {
                this.container2.add(this.container1.contains());
                this.container1.remove(amount);
            } else {
                this.container1.remove(amount);
                this.container2.add(amount);
            }
        }
    }

    public void remove(int amount) {
        this.container2.remove(amount);
    }

}
