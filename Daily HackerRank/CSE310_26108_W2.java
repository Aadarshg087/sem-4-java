import java.util.Scanner;

public class CSE310_26108_W2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double n = x - ((0.1) * x);
        double m = y - ((0.2) * y);
        double s = z - ((0.3) * z);
        double a = m * 2;
        double b = s * 3;
        double i = a + b + n;
        int sum = (int) i;
        System.out.println(sum);
        sc.close();
    }
}
