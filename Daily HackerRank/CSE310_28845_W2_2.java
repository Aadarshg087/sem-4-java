import java.util.*;

public class CSE310_28845_W2_2 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double a;
        double price;
        double cal = 0.18;
        a = ip.nextInt();
        if (a >= 450) {
            price = a + cal * a;
            int num = (int) price;
            if (price - num == 0.0) {
                System.out.println(num);
            } else
                System.out.println(price);
        } else
            System.out.println("Invalid Input");
        ip.close();
    }
}