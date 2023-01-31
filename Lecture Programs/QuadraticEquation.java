import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {
    static void quadra(int num1, int num2, int num3) {
        double dnum1 = num1;
        double dnum2 = num2;
        double dnum3 = num3;
        double quad = (-dnum1 + (Math.sqrt((dnum2 * dnum2) - (4.0 * dnum1 * dnum3)))) / 2.0 * dnum1;
        double quad2 = (-dnum1 - (Math.sqrt((dnum2 * dnum2) - (4.0 * dnum1 * dnum3)))) / 2.0 * dnum1;
        System.out.println(quad);
        System.out.println(quad2 / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        quadra(num1, num2, num3);
        sc.close();
    }
}
