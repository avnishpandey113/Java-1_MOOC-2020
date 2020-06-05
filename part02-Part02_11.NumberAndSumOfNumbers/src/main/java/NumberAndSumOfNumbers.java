
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                totalNumbers += 1;
                sumOfNumbers += number;
            }
        }
        System.out.println("Number of numbers: "+totalNumbers);
        System.out.println("Sum of the numbers: "+sumOfNumbers);
    }
}
