import java.util.Scanner;

public class CSE310_W1_28845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, sum;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        if (a < 20 && b < 20 && c < 15 && d < 15) {
            sum = a + b + c + d;
            System.out.println("" + sum);
        } else
            System.out.println("Invalid Input");
        input.close();
    }

}
