import java.util.Scanner;

public class cse310_w2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 18) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Eligible");
        }
        sc.close();
    }
}
