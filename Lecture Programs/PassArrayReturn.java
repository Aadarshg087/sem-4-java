import java.util.Scanner;

public class PassArrayReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size:");
        size = sc.nextInt();
        int array[] = new int[size];
        fillArray(array, size);
        printArray(array, size);
        sc.close();
    }

    public static void fillArray(int array[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void printArray(int array[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
