
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scan.nextLine());
        if (points < 0) {
            System.out.println("Grade: impossible!");
        } else if (points <= 49){
            System.out.println("Grade: failed");
        }  else if (points <= 59){
            System.out.println("Grade: 1");
        }  else if (points <= 69){
            System.out.println("Grade: 2");
        }  else if (points <= 79){
            System.out.println("Grade: 3");
        }  else if (points <= 89){
            System.out.println("Grade: 4");
        }  else if (points <= 100){
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
