
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String charachterName = scanner.nextLine();
        System.out.println("What is their job?");
        String jobDescription = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+charachterName+", who was "+jobDescription+".");
        System.out.println("On the way to work, "+charachterName+" reflected on life.");
        System.out.println("Perhaps "+charachterName+" will not be "+jobDescription+" forever.");
        

    }
}
