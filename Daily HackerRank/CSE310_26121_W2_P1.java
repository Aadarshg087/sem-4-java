import java.util.Scanner;

public class CSE310_26121_W2_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 10 && n <= 99) {
            int num1 = n % 10;
            int num2 = n / 10;
            int sum_of_digits = num1 + num2;
            int product_of_digits = num1 * num2;
            if (sum_of_digits + product_of_digits == n) {
                System.out.println("special two digit number");
            } else {
                System.out.println("not a special two digit number");
            }
        } else {
            System.out.println("invalid input");
        }
        sc.close();
    }

}
