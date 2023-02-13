import java.util.*;

/**
 * ArrayList
 */
public class ArrayListExample1 {

    public static void main(String[] args) {
        // Size of the array list
        int n = 5;
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            arrli.add(i);
        }
        // printing the elements
        System.out.println("Printing the elements by default: ");
        System.out.println(arrli);

        // removing elements at index 3
        System.out.println("Removing the elements at index 3: ");
        System.out.println(arrli.get(3));
        arrli.remove(3);

        // Displaying the array list after deletion
        System.out.println("Printing the array after deletion: ");
        System.out.println(arrli);

        // Printing elements one by one
        System.out.println("Prinitng the elements using for loop: ");
        for (int i = 0; i < n - 1; i++) {
            // n-1 is there because we deleted on elements
            System.out.print(arrli.get(i) + " ");
        }
    }
}