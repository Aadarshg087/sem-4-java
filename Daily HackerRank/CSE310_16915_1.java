import java.util.*;

public class CSE310_16915_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int value1 = console.nextInt();
        int value2 = console.nextInt();
        int value3 = console.nextInt();
        if (value1 < 0 || value2 < 0 || value3 < 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(value1 + "*" + value2 + "*" + value3);
        }
        console.close();
    }
}
