
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdWatcher birdWatcher = new BirdWatcher();
        UserInterface userInterface = new UserInterface(scanner, birdWatcher);
        userInterface.start();
    }
}
