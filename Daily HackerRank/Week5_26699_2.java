import java.util.Scanner;

public class Week5_26699_2 {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(String str1, String str2) {
        System.out.println(str1 + str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            add(num1, num2);
        } else if (input == 2) {
            String str1 = sc.next();
            String str2 = sc.next();
            add(str1, str2);
        } else {
            System.out.println("ERROR");
            sc.close();
            return;
        }
    }
}
