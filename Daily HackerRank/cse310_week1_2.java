
/**
 * cse310_week1_2
 */
import java.util.*;

public class cse310_week1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_chocolates = input.nextInt();
        int total_friends = input.nextInt();
        System.out.println(total_chocolates / total_friends);
        input.close();
    }
}