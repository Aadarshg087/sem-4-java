import java.util.*;

public class CSE310_21482_1 {
    public class Solution {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int a = input.nextInt();
            int b = input.nextInt();
            if (a > 1 && a < 1000 && b > 1 && b < 100 && a % b == 0) {
                System.out.print("Multiple");
            } else {
                System.out.print("Not Multiple");
            }
            input.close();
        }
    }
}
