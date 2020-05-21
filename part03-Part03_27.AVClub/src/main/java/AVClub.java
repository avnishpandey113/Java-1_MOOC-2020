
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }

            String[] pieces = text.split(" ");
            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }

    }
}
