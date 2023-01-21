import java.util.*;

public class week1_26699_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = 2 * x;
        int temp = x;
        x = y;
        y = temp;
        System.out.print(x + " " + y);
        console.close();

    }
}
