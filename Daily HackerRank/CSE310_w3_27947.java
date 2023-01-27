import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class CSE310_w3_27947 {
    private static final DecimalFormat decfor = new DecimalFormat("0.0");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c_temp = sc.nextInt();
        if (c_temp >= 30 && c_temp <= 45) {
            Double f_temp = (c_temp * (9.0 / 5)) + 32;
            System.out.println(decfor.format(f_temp));
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
