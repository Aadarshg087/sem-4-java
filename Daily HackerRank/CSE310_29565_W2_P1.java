import java.text.DecimalFormat;
import java.util.*;

public class CSE310_29565_W2_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double temperature = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        if (choice == 1) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println(df.format(celsius));
        } else if (choice == 2) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println(fahrenheit);
        } else {
            System.out.println("INVALID CHOICE");
        }
        sc.close();
    }

}
