import java.util.Scanner;

public class ArrayArguments {
    static Scanner sc = new Scanner(System.in);

    static void printArray(int array[], int size) {
        System.out.println("Printing the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int size = sc.nextInt();

        int array[] = new int[size];

        // Filling the array function/method
        fillArray(array, size);

        // Printing the array function/method
        printArray(array, size);

    }

    static public void fillArray(int array[], int size) {

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
    }
}
