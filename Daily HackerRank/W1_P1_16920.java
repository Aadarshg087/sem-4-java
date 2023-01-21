import java.util.*;

public class W1_P1_16920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long accountNumber = sc.nextLong();
        sc.nextLine();
        String accountHolderName = sc.nextLine();
        char gender = sc.nextLine().charAt(0);
        int amount = 0;
        sc.close();
        try {
            amount = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, Amount should be in number");
            return;
        }
        int currentBalance = 20000;
        if (amount <= currentBalance) {
            currentBalance -= amount;
            System.out.print("Hi ");
            if (gender == 'M') {
                System.out.print("Mr. ");
            } else {
                System.out.print("Ms. ");
            }
            System.out.print(accountHolderName + "! " + '\n');
            System.out.println("Your Account Balance after withdrawl is " + currentBalance + ".");
        } else {
            System.out.print("Hi ");
            if (gender == 'M') {
                System.out.print("Mr. ");
            } else {
                System.out.print("Ms. ");
            }
            System.out.print(accountHolderName + "! " + '\n');
            System.out.println("Insufficient Funds! You can not withdraw " + amount + ".");
        }

    }
}
