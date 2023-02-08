import java.util.Scanner;

class Array {
    static public void fillArray(int array[], int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    static public void printArray(int array[], int size) {
        System.out.println("Printing the array from the another class: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayAnotherClass {
    public static void main(String[] args) {
        int size = 4;
        int array[] = new int[size];
        Array.fillArray(array, size);
        Array.printArray(array, size);
    }
}
