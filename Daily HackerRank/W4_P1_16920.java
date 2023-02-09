import java.util.*;

public class W4_P1_16920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        switch (sub) {
            case "Java":
                System.out.println("Shruti 4");
                break;
            case "OS":
                System.out.println("Puneet Kumar 3");
                break;
            case "AI":
                System.out.println("James William 2");
                break;
            case "Android":
                System.out.println("Md. Adil Khan 3");
                break;
            default:
                System.out.println("This subject is not running in this semester.");
        }
        sc.close();

    }
}
