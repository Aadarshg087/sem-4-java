import java.util.Scanner;

public class CSE310_26121_W4_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch (str) {
            case "Monday":
                System.out.println("8:30 5:30");
                break;
            case "Tuesday":
                System.out.println("8:30 5:30");
                break;
            case "Wednesday":
                System.out.println("8:30 5:30");
                break;
            case "Thursday":
                System.out.println("8:30 5:30");
                break;
            case "Friday":
                System.out.println("8:30 5:30");
                break;
            case "Saturday":
                System.out.println("8:30 5:30");
                break;
            default:
                System.out.println("Library is closed");
        }
        sc.close();
    }
}
