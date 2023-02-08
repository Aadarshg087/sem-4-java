import java.nio.file.ClosedDirectoryStreamException;
import java.util.Scanner;

public class CSE310_24906_W4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array1[] = new int[size];
        int array2[] = new int[size];

        // Input in first array
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        sc.close();

        // Copying the elements in the second array
        for (int i = 0; i < size; i++) {
            array2[i] = array1[i];
        }

        // Printing the first array
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Printing the second array
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " ");
        }

    }
}
