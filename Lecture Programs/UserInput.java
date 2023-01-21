import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("My name is "+ name);
	int value = input.nextInt();
	System.out.print("Hello: "+ value);


        }
    }