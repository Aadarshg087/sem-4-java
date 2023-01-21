import java.util.*;

public class CSE310_w1_27947 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        String c;
        double d;
        double sum = 0;
        double sum1 = 0;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.next();
        d = input.nextDouble();

        if (a <= 1000000.0 && a > 0.0 && b <= 1000000.0 && b > 0.0 && d > 0.01 && d < 1000 && c.equals("Silver")) {
            sum = (d / 1000) * a;
            int val = (int) sum;
            System.out.println("" + val);

        } else if (a <= 1000000 && a > 0 && b <= 1000000 && b > 0 && d > 0.01 && d < 1000 && c.equals("Gold")) {
            sum1 = (d / 10) * b;
            int val1 = (int) sum1;
            System.out.println("" + val1);
        } else
            System.out.println("Invalid Input");
        input.close();
    }
}
