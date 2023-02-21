
/**
 * Staff
 */
import java.util.*;;

public class Staff {
    private String name;
    private int id;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id no: ");
        int num = sc.nextInt();
        System.out.println("Enter the name: ");
        String name = sc.next();
        sc.close();
        Staff s1 = new Staff(num, name);
        s1.display();

    }
}