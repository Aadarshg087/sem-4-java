import java.util.*;

public class CSE310_max_week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int white_balloons = sc.nextInt();
        int red_balloons = sc.nextInt();
        if (white_balloons < 0 || red_balloons < 0) {
            System.out.println(0);
        } else {
            int total_score = (white_balloons * 1) + (red_balloons * 2);
            System.out.println(total_score);
        }
        sc.close();
    }
}
