import java.util.*;

public class CSE310_arithmetic_operation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        char ch = console.next().charAt(0);
        if (ch == '+') {
            System.out.println(num1 + num2);
        } else if (ch == '-') {
            System.out.println(num1 - num2);
        } else if (ch == '/') {
            System.out.println(num1 / num2);
        } else if (ch == '*') {
            System.out.println(num1 * num2);
        } else if (ch == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid arithmetic operators");
        }
        console.close();
    }
}
