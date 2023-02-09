import java.util.*;

public class CSE310_21482_Week4_1 {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int k = 7;
            int total = 0;
            int arr[] = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            if (total == 56) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}
