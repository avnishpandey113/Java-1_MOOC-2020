
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// The task is to keep track of input numbers
        int negativeNumbers = 0;

// The task is to read an input from the user
        while (true) {
            System.out.println("Give a number:");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }

            // The task is to increase the amount of ones
            // if the user inputs a number one
            if (number <0) {
                negativeNumbers = negativeNumbers + 1;
            }
        }

// The task is to print out the total of input numbers
        System.out.println("Number of negative numbers: " + negativeNumbers);
    }
}
