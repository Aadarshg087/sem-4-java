import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Week3_26699_1 {

    public static void main(String[] args) {
        // DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double present_balance = sc.nextDouble();
        int num = sc.nextInt();
        if (num == 1) {
            double withdraw = sc.nextDouble();
            if (withdraw <= present_balance) {
                present_balance = present_balance - withdraw;
                System.out.printf("%.2f", present_balance);
            } else {
                System.out.println("error");
            }
        } else if (num == 2) {
            double deposit = sc.nextDouble();
            present_balance = present_balance + deposit;
            System.out.printf("%.2f", present_balance);
        } else if (num == 3) {
            System.out.printf("%.2f", present_balance);
        } else {
            System.out.println("error");
            sc.close();
        }
    }
}
