import java.util.Scanner;

public class CSE310_21482_Week4_2 {
    static public int average(int num1, int num2) {
        return (num1 + num2) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int height[] = new int[size];
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < size; i++) {
            if (height[i] % 2 != 0 && height[i + 1] % 2 != 0) {
                int avg = average(height[i], height[i + 1]);
                
            }

        }
    }
}
