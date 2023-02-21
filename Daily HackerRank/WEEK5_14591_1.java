
/**
 * WEEK5_14591_1
 */
import java.util.Scanner;

public class WEEK5_14591_1 {
    static boolean check(int n) {
        if ((n % 2 == 0) && (n % 3 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n < 20 || n > 400) {
            System.out.println("Invalid Input");
            return;
        }
        boolean isEven = check(n);
        if (isEven) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}