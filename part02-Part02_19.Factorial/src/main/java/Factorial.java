
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int factorialNumber = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        while (factorialNumber > 1) {
            factorial = factorial * factorialNumber;
            factorialNumber--;
        }
        System.out.println("Factorial:" + factorial);

    }
}
