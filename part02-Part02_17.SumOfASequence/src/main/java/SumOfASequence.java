
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum =0;
        while(lastNumber>0){
            sum+=lastNumber;
            lastNumber--;
        }
        System.out.println("The sum is "+sum);

    }
}
