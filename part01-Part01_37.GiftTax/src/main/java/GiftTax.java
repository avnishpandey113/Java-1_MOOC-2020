
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        if (giftValue >= 5000 && giftValue < 25000) {
            System.out.println("Tax: " + (100 + (giftValue - 5000) * 0.08));
        } else if (giftValue >= 25000 && giftValue < 55000) {
            System.out.println("Tax: " + (1700 + (giftValue - 25000) * 0.10));
        } else if (giftValue >= 55000 && giftValue < 200000) {
            System.out.println("Tax: " + (4700 + (giftValue - 55000) * 0.12));
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            System.out.println("Tax: " + (22100 + (giftValue - 200000) * 0.15));
        } else if (giftValue >= 1000000) {
            System.out.println("Tax: " + (142100 + (giftValue - 1000000) * 0.17));
        } else {
            System.out.println("No tax!");
        }
    }
}
