
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = scan.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scan.nextLine();
        if (firstString.equals(secondString)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
