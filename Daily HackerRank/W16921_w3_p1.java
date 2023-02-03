import java.util.Scanner;

/**
 * 16921-w3-p1
 */
public class W16921_w3_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num <= 0) {
            System.out.println("Invalid Rows");
        } else {

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println("");
            }
        }
    }
}