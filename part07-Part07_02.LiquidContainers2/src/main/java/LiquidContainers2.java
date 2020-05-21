
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        UserInterface ui = new UserInterface(container1, container2, scanner);

        ui.start();
    }

}
