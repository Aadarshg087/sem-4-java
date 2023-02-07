import java.util.Scanner;

public class Week4_26699_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = -2147483647;
        int min = 2147483647;
        int location = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                location = i;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        arr[location] = min;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
