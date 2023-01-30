import java.util.Scanner;

public class CSE310_28845_w3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money <= 100 || money >= 20000 || money % 100 != 0) {
            System.out.println("Invalid Input");
        } else {
            int rem = 550;
            while (money != 0) {
                if (money >= 500) {
                    int ans = money / 500;
                    System.out.println(ans + " 500 Notes");
                    rem = money % 500;
                    money = rem;
                } else if (money >= 200) {
                    int ans = money / 200;
                    System.out.println(ans + " 200 Notes");
                    rem = money % 200;
                    money = rem;
                } else {
                    System.out.println(rem / 100 + " 100 Notes");
                    money = 0;
                }
            }
        }
        sc.close();

    }
}