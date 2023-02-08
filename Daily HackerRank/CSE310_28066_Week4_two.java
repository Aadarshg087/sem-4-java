import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class CSE310_28066_Week4_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int maxElement = 0;
        int minElement = 2147483647;
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        sc.close();
        int total = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != minElement && array[i] != maxElement) {
                total += array[i];
            }
        }
        System.out.println(total);

    }
}
