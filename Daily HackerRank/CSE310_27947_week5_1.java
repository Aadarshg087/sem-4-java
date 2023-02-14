import java.util.Scanner;

public class CSE310_27947_week5_1 {
    public static void primeFactors(int num) {
        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };
        // int arr2[] = new int[10];
        int i = 0;
        while (i < arr.length) {
            if (num == 1 || num == 0) {
                break;
            } else if (num % arr[i] == 0) {
                num = num / arr[i];
                System.out.print(arr[i] + " ");
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num < 10 || num > 50) {
            System.out.println("Invalid input");
            return;
        }
        primeFactors(num);
    }
}
