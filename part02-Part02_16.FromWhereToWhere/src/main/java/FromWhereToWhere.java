
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to?");
        int upperLimit = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        while (lowerLimit<=upperLimit) {
            System.out.println(lowerLimit);
            lowerLimit++;
        }
    }
}
