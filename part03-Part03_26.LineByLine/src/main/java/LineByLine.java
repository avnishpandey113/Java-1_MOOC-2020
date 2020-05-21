
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] pieces = text.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }

    }
}
