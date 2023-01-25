import java.util.Scanner;
import java.lang.Math;

public class week1_26699_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(Math.abs(num));
        } else {
            System.out.println(num);
        }
        sc.close();
    }
}
