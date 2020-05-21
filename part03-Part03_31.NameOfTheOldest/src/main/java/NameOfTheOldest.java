
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, helper = 0;
        String helperName = "";
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] pieces = text.split(",");
            age = Integer.valueOf(pieces[1]);
            if (age >= helper) {
                helper = age;
                helperName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + helperName);

    }
}
