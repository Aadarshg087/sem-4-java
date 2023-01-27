import java.util.*;
import java.text.DecimalFormat;

public class CSE310_21482_Week2_1 {
    private static final DecimalFormat decfor = new DecimalFormat("0.0");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f_temp = sc.nextInt();
        if (f_temp >= 95 && f_temp <= 105) {
            Double c_temp = (5.0 / 9.0) * (f_temp - 32);
            System.out.println(decfor.format(c_temp));
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}