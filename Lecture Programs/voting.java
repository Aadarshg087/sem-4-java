import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Cannot Vote");
        } else {
            System.out.println("Can Vote");
        }
        sc.close();
    }
}
