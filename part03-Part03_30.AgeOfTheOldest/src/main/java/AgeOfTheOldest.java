
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, helper = 0;
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] pieces = text.split(",");
            age = Integer.valueOf(pieces[1]);
            if (age >= helper) {
                helper = age;
            }
        }
        System.out.println("Age of the oldest: " + helper);
    }
}
