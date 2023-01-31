import java.util.Scanner;

public class CountDemo {
    public static void main(String[] args) {
        // int marks1 = Integer.parseInt(args[0]);
        // int marks2 = Integer.parseInt(args[1]);
        // int marks3 = Integer.parseInt(args[2]);
        // int marks4 = Integer.parseInt(args[3]);

        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        sc.close();
        int passCount = 0;
        if (marks1 >= 50) {
            passCount++;
        }
        if (marks2 >= 50) {
            passCount++;
        }
        if (marks3 >= 50) {
            passCount++;
        }
        if (marks4 >= 50) {
            passCount++;
        }

        System.out.println(passCount);

    }
}
