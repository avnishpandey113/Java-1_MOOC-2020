
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, helperLength = 0, nameLength;
        String helperName = "";
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] pieces = text.split(",");
            sum += Integer.valueOf(pieces[1]);
            count++;
            nameLength = pieces[0].length();
            if (helperLength < nameLength) {
                helperLength = nameLength;
                helperName = pieces[0];
            }

        }
        System.out.println("Longest name: " + helperName);
        System.out.println("Average of the birth years: "+1.0*sum/count);

    }
}
