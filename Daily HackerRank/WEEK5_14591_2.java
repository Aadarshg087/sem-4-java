import java.util.Scanner;

public class WEEK5_14591_2 {

    static boolean isBigger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        if (num1 < 10 || num1 > 1000) {
            System.out.println("Invalid Input");
            return;
        } else if (num2 < 10 || num2 > 1000) {
            System.out.println("Invalid Input");
            return;
        }
        boolean isBig = isBigger(num1, num2);
        System.out.println(isBig);
    }
}
